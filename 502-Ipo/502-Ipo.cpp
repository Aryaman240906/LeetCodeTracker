// Last updated: 11/07/2026, 00:05:51
class Solution {
public:
    int findMaximizedCapital(int k, int w, vector<int>& profits, vector<int>& capital) {
        int n = profits.size();
    vector<pair<int,int>> projects;
    for (int i = 0; i < n; i++) projects.push_back({capital[i], profits[i]});
    sort(projects.begin(), projects.end());
    
    priority_queue<int> pq; // max-heap of profits
    int i = 0;
    while (k--) {
        while (i < n && projects[i].first <= w)
            pq.push(projects[i++].second);
        if (pq.empty()) break;
        w += pq.top(); pq.pop();
    }
    return w;
    }
};