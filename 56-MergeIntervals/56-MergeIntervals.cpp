// Last updated: 11/07/2026, 00:06:09
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin() , intervals.end()); // Pehle lexicographically intervals ko sort kardo
        vector<vector<int> >merged; // Next ouput result ke liye ek 2d vector lo merged 
        for(auto interval : intervals){
            if(merged.empty() || merged.back()[1] < interval[0]){
                merged.push_back(interval);
            }
            else{
                merged.back()[1] = max(merged.back()[1] , interval[1]);
            }
        }
        return merged;
    }
};