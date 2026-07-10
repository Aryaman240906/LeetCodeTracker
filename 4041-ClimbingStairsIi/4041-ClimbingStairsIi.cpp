// Last updated: 11/07/2026, 00:05:24
class Solution {
public:
    int climbStairs(int n, vector<int>& costs) {
        const int INF = 1e9;
        
        array<int, 3> last;
        last.fill(INF);
        last[0] = 0; 

        for (int i = 1; i <= n; ++i) {
            int cur = INF;
            for (int jump = 1; jump <= 3; ++jump) {
                int prev = i - jump;
                if (prev < 0) continue;
                int dpPrev = last[prev % 3];
                int stepCost = costs[i - 1]; 
                cur = min(cur, dpPrev + stepCost + jump * jump);
            }
            last[i % 3] = cur;
        }
        return last[n % 3];
    }
};
