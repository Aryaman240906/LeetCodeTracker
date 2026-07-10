// Last updated: 11/07/2026, 00:05:46
class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        vector<int>Freq(26,0);
        for(char c : tasks)Freq[c - 'A']++;

        priority_queue<int>pq;
        for(int F : Freq)if(F>0)pq.push(F);

        int time = 0;
        queue<pair<int,int> >cooldown;

        while(!pq.empty() || !cooldown.empty()){
            time++;
            if(!pq.empty()){
                int curr = pq.top();
                pq.pop();
                curr--;
                if(curr>0)cooldown.push({curr , time+n});
            }
            if(!cooldown.empty() && cooldown.front().second == time){
                pq.push(cooldown.front().first);
                cooldown.pop();
            }
        }
        return time;
    }
};