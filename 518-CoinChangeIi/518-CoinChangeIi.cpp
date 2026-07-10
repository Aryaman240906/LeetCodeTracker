// Last updated: 11/07/2026, 00:05:48
class Solution {
public:
    int change(int amount, vector<int>& coins) {
        vector<unsigned long long> dp(amount + 1, 0); // dp[a] = number of ways to make amount a
        dp[0] = 1;                     // base case: 1 way to make amount 0 (pick nothing)

        // process each coin
        for (int c : coins) {
            for (int a = c; a <= amount; ++a) {
                dp[a] += dp[a - c];   // add ways to make (a - c)
            }
        }

        return (int)dp[amount];
    }
};
