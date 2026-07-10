// Last updated: 11/07/2026, 00:05:55
class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& pts) {
         if (pts.empty()) return 0;
        sort(pts.begin(), pts.end(), [](auto &a, auto &b){ return a[1] < b[1]; });
        long long arrows = 1, pos = pts[0][1];
        for (auto &p : pts) if (p[0] > pos) { ++arrows; pos = p[1]; }
        return (int)arrows;
    }
};