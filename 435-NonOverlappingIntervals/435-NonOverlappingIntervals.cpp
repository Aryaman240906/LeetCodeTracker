// Last updated: 11/07/2026, 00:05:53
class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
         int n = intervals.size();
        if (n == 0) return 0;
        sort(intervals.begin(), intervals.end(), [](auto &a, auto &b){ return a[1] < b[1]; });
        int kept = 1, last_end = intervals[0][1];
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] >= last_end) {
                ++kept;
                last_end = intervals[i][1];
            }
        }
        return n - kept;
    }
};