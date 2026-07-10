// Last updated: 11/07/2026, 00:05:41
class Solution {
public:
    string reorganizeString(string s) {
        vector<int> freq(26, 0);
        for (char c : s) freq[c - 'a']++;
        
        priority_queue<pair<int, char>> pq;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.push({freq[i], 'a' + i});
        }
        
        queue<pair<int, char>> cooldown;
        string result = "";
        char last = '#';
        
        while (!pq.empty() || !cooldown.empty()) {
            // Move from cooldown to pq if available
            if (!cooldown.empty()) {
                pq.push(cooldown.front());
                cooldown.pop();
            }
            
            if (pq.empty()) return ""; // Should not happen, but safety check
            
            auto [count, ch] = pq.top();
            pq.pop();
            
            if (ch != last) {
                // Use this character
                result += ch;
                last = ch;
                if (--count > 0) {
                    cooldown.push({count, ch});
                }
            } else {
                // Try to use the next most frequent
                if (pq.empty()) return "";
                auto [nextCount, nextCh] = pq.top();
                pq.pop();
                
                result += nextCh;
                last = nextCh;
                if (--nextCount > 0) {
                    cooldown.push({nextCount, nextCh});
                }
                // Put the original back
                pq.push({count, ch});
            }
        }
        
        return result.length() == s.length() ? result : "";
    }
};
