// Last updated: 11/07/2026, 00:05:56
class Solution {
public:
    void fastio(){
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);
    }
    vector<vector<int>> reconstructQueue(vector<vector<int>>& people) {
        fastio();
        // The problem requires us to reconstruct the queue order such that an ith person in the queue with attribute (h , k) has exactly k ppl infront of him/her that are taller or equal in height to them 
        sort(people.begin() , people.end() ,[](const vector<int>&a , const vector<int>&b ){
            if(a[0] == b[0])return a[1]<b[1]; // Agar height mai tie breaker ho then k ko ascending order mai arrange karo
            return a[0]>b[0]; // Height ko descending order mai arrange kardo
        });// We basically sort height in decending order to get taller ppl first because insertion of shorter height ppl does not affect their 'k' attribute and in case of tie breaker arrange in ascending values of k cuz the problem states that in case of >= height we have to ensure the value of k attribute is maintained accordingly

        vector<vector<int>> queue;
        for(auto &p : people){
            queue.insert(queue.begin()+p[1], p); // ✅ fixed: should use queue.begin() not people.begin()
            // Hum jo queue.begin()+p[1] kar rahe yaha par that's cuz hum k index par insert karna chahre hai locally optimality ke acc taaki hum suppose maan lo insert kar rahe If we inserted shortest first, the later taller people would disrupt earlier placements —the k values would no longer hold That’s why we must fix the taller ones first, since their position is final — shorter people can always “fit in” later without breaking anything.\U0001f3c1 So, “insert at index = k” means: “Place this person so that exactly k taller-or-equal people are in front — and since everyone already in the queue is taller or equal (due to sorting),that’s exactly position k.”
            /* Example of how Insertion will look like [[7,0]] ;[[7,0],[7,1]] ; [[7,0],[6,1],[7,1]] ;[[5,0], [7,0], [6,1], [7,1]] */
        }
        return queue;
    }
};
