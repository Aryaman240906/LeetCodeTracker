// Last updated: 07/08/2026, 18:51:27
class Solution {

    private int digitProduct(int num) {

        int product = 1;

        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return product;
    }

    public int smallestNumber(int n, int t) {

        for (int i = n; i <= 100; i++) {

            if (digitProduct(i) % t == 0)
                return i;
        }

        return -1;
    }
}