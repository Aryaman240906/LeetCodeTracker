// Last updated: 22/08/2026, 17:16:54
1class Solution {
2    private int sumOfDigits(int n){
3        int sum = 0;
4        int temp = 0;
5        while(n>0){
6            temp = n%10;
7            sum += temp;
8            n = n/10;
9        }
10        return sum;
11    }
12    private int productOfDigits(int n){
13        int product = 1;
14        int temp = 1;
15        while(n>0){
16            temp = n%10;
17            product *= temp;
18            n = n/10;
19        }
20        return product;
21    }
22    public boolean checkDivisibility(int n) {
23        int digit_sum = sumOfDigits(n);
24        int product_sum = productOfDigits(n);
25        int total = digit_sum + product_sum;
26        return(n%total==0);
27    }
28}