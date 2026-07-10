// Last updated: 11/07/2026, 00:05:31
class Solution {
public:
    int videoStitching(vector<vector<int>>& clips, int time) {
        sort(clips.begin(), clips.end());
        int n = clips.size(), i = 0, res = 0, end = 0;
        while (end < time) {
            int farthest = end;
            while (i < n && clips[i][0] <= end) {
                farthest = max(farthest, clips[i][1]);
                ++i;
            }
            if (farthest == end) return -1;
            end = farthest;
            ++res;
        }
        return res;
    }
};