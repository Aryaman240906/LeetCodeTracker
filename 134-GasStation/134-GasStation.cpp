// Last updated: 11/07/2026, 00:06:03
class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int total = 0;
        int tank = 0;
        int idx = 0;
        for(int i =0; i<n ; i++){
            int net = gas[i]-cost[i];
            total += net;
            tank += net;
            if(tank < 0){
                idx = i+1;
                tank = 0;
            }
        }
        if(total >= 0)return idx;
        else return -1;
    }
};