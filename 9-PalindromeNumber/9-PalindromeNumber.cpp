// Last updated: 11/07/2026, 00:06:24
class Solution {
public:
    bool isPalindrome(int n) {
    if (n < 0) return false; // Negative numbers aren't palindromes

    int original = n;
    long long reversed = 0;

    while (n > 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n /= 10;
    }

    return original == reversed;
    }
};