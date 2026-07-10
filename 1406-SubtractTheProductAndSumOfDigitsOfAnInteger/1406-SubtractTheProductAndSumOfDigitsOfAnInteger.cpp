// Last updated: 11/07/2026, 00:05:28
class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return product - sum;
    }
};