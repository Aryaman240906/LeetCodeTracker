// Last updated: 11/07/2026, 00:05:37
class Solution {
public:
    int minRefuelStops(int target, int startFuel, vector<vector<int>>& stations) {
        // Edge cases
        if (stations.empty()) {
            return startFuel >= target ? 0 : -1;
        }
        if (stations[0][0] > startFuel) return -1;
        if (target == startFuel) return 0;

        int n = stations.size();
        priority_queue<int> pq; // max-heap to store available fuels
        int fuel = startFuel;
        int idx = 0, stops = 0;

        // Main greedy loop
        while (fuel < target) {
            // Push all stations we can reach so far
            while (idx < n && stations[idx][0] <= fuel) {
                pq.push(stations[idx][1]);
                idx++;
            }

            // If no station available to refuel → can't proceed
            if (pq.empty()) return -1;

            // Refuel from the station with max fuel
            fuel += pq.top();
            pq.pop();
            stops++;
        }
        return stops;
    }
};
