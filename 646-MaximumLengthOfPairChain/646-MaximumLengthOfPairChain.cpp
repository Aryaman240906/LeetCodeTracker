// Last updated: 11/07/2026, 00:05:43
class Solution {
public:
    int findLongestChain(vector<vector<int>>& pairs) {
        sort(pairs.begin(), pairs.end(), [](auto &a, auto &b){ return a[1] < b[1]; });
        int count = 0, end = INT_MIN;
        for (auto &p : pairs) if (p[0] > end) { ++count; end = p[1]; }
        return count;
    }
};