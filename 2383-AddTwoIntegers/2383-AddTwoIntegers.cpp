// Last updated: 11/07/2026, 00:05:18
#define endl '\n'
class Solution {
public:
    int sum(int num1, int num2) {
        long long mod = 1e9+7;
        int add = (num1%mod + num2%mod)%mod;
        return add; 
    }
    int main(){
        int num1 , num2;
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);
        cin>>num1;
        cin>>num2;
        cout<<sum(num1 , num2)<<'\n';
    return 0;
    }
};