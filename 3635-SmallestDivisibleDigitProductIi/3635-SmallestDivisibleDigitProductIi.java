// Last updated: 07/08/2026, 18:51:31
class Solution {

    private static final int[] PRIMES = {2, 3, 5, 7};

    private static final int[][] DIGIT_FACTORS = {
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {1, 0, 0, 0},
        {0, 1, 0, 0},
        {2, 0, 0, 0},
        {0, 0, 1, 0},
        {1, 1, 0, 0},
        {0, 0, 0, 1},
        {3, 0, 0, 0},
        {0, 2, 0, 0}
    };

    private boolean factorizeTarget(long t, int[] required) {
        for (int i = 0; i < 4; i++) {
            while (t % PRIMES[i] == 0) {
                required[i]++;
                t /= PRIMES[i];
            }
        }
        return t == 1;
    }

    private int[] factorizeDigits(String num) {
        int[] count = new int[4];

        for (char c : num.toCharArray()) {
            int[] factors = DIGIT_FACTORS[c - '0'];
            for (int i = 0; i < 4; i++) {
                count[i] += factors[i];
            }
        }

        return count;
    }
        private int[] compressIntoDigits(int[] count) {
        int[] digits = new int[10];

        digits[8] = count[0] / 3;
        int rem2 = count[0] % 3;

        digits[9] = count[1] / 2;
        int rem3 = count[1] % 2;

        digits[4] = rem2 / 2;
        digits[2] = rem2 % 2;

        if (digits[2] == 1 && rem3 == 1) {
            digits[2] = 0;
            digits[6] = 1;
            rem3 = 0;
        }

        if (digits[4] == 1 && rem3 == 1) {
            digits[4] = 0;
            digits[2] = 1;
            digits[6] = 1;
            rem3 = 0;
        }

        digits[3] = rem3;
        digits[5] = count[2];
        digits[7] = count[3];

        return digits;
    }

    private int requiredDigitCount(int[] digits) {
        int count = 0;
        for (int d = 2; d <= 9; d++) {
            count += digits[d];
        }
        return count;
    }

    private void subtractPrimeContribution(
            int[] required,
            int[] prefix,
            int[] digitContribution,
            int[] remaining) {

        for (int i = 0; i < 4; i++) {
            remaining[i] = Math.max(
                0,
                required[i] - prefix[i] - digitContribution[i]
            );
        }
    }
        private String buildSmallestSuffix(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for (int d = 2; d <= 9; d++) {
            while (digits[d]-- > 0) {
                sb.append(d);
            }
        }

        return sb.toString();
    }

    private boolean hasRequiredPrimes(int[] required, int[] available) {
        for (int i = 0; i < 4; i++) {
            if (required[i] > available[i]) {
                return false;
            }
        }
        return true;
    }
        public String smallestNumber(String num, long t) {
        int[] required = new int[4];
        if (!factorizeTarget(t, required)) {
            return "-1";
        }
int[] requiredDigits = compressIntoDigits(required);
int minDigits = requiredDigitCount(requiredDigits);

if (minDigits > num.length()) {
    return buildSmallestSuffix(requiredDigits);
}
        int[] prefix = factorizeDigits(num);

        int firstZero = num.indexOf('0');
        if (firstZero == -1) {
            firstZero = num.length();
            if (hasRequiredPrimes(required, prefix)) {
                return num;
            }
        }

        int[] remaining = new int[4];

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            for (int j = 0; j < 4; j++) {
                prefix[j] -= DIGIT_FACTORS[digit][j];
            }

            if (i > firstZero) {
                continue;
            }

            int space = num.length() - 1 - i;

            for (int next = digit + 1; next <= 9; next++) {
                subtractPrimeContribution(required, prefix, DIGIT_FACTORS[next], remaining);

                int[] suffixDigits = compressIntoDigits(remaining);
                int need = requiredDigitCount(suffixDigits);

                if (need <= space) {
                    return num.substring(0, i)
                            + next
                            + "1".repeat(space - need)
                            + buildSmallestSuffix(suffixDigits);
                }
            }
        }

        requiredDigits = compressIntoDigits(required);
        return "1".repeat(num.length() + 1 - requiredDigitCount(requiredDigits))
                + buildSmallestSuffix(requiredDigits);
    }
}