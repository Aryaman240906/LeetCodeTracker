// Last updated: 11/07/2026, 00:05:45
class Solution {
public:
    int scheduleCourse(vector<vector<int>>& courses) {
        sort(courses.begin(), courses.end(),
         [](auto &a, auto &b){ return a[1] < b[1]; });
    priority_queue<int> pq;
    int total = 0;
    for (auto &c : courses) {
        total += c[0];
        pq.push(c[0]);
        if (total > c[1]) {
            total -= pq.top();
            pq.pop();
        }
    }
    return pq.size();
    }
};