// Last updated: 11/07/2026, 00:05:30

class Solution {
public:
    int twoCitySchedCost(vector<vector<int>>& costs) {
        int n = costs.size() / 2;  // n = number of people per city
        int totalCost = 0;
        
        // Sort by (aCost - bCost) ascending
        sort(costs.begin(), costs.end(), [](const vector<int>& a, const vector<int>& b) {
            return (a[0] - a[1]) < (b[0] - b[1]);  // diff ascending
        });
        
        // First n go to A, rest to B
        for (int i = 0; i < costs.size(); ++i) {
            if (i < n) {
                totalCost += costs[i][0];  // A cost
            } else {
                totalCost += costs[i][1];  // B cost
            }
        }
        
        return totalCost;
    }
};
