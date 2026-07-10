// Last updated: 11/07/2026, 00:05:33
class Solution {
public:
    int fib(int n) {
        if(n<0)return -1;
        if(n<=1)return n;
        int prev1, prev2, curr;
        prev1 = 1;
        prev2 = 0;
        for(int i=2 ; i<=n ; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
};