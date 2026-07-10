// Last updated: 11/07/2026, 00:05:26
class Solution {
public:
    int countDigits(int num) {
        int original = num;
        int counter = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && original % digit == 0) {
                counter++;
            }
            num /= 10;
        }

        return counter;
    }
};