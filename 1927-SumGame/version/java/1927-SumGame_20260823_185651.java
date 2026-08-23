// Last updated: 23/08/2026, 18:56:51
1class Solution {
2    public boolean sumGame(String num) {
3
4        int n = num.length();
5        int half = n / 2;
6
7        int leftSum = 0;
8        int rightSum = 0;
9
10        int leftQuestion = 0;
11        int rightQuestion = 0;
12
13        for (int i = 0; i < half; i++) {
14
15            if (num.charAt(i) == '?') {
16                leftQuestion++;
17            } else {
18                leftSum += num.charAt(i) - '0';
19            }
20        }
21
22        for (int i = half; i < n; i++) {
23
24            if (num.charAt(i) == '?') {
25                rightQuestion++;
26            } else {
27                rightSum += num.charAt(i) - '0';
28            }
29        }
30
31        int totalQuestions = leftQuestion + rightQuestion;
32
33        if (totalQuestions % 2 == 1) {
34            return true;
35        }
36
37        int sumDifference = leftSum - rightSum;
38
39        int questionDifference =
40                rightQuestion - leftQuestion;
41
42        return sumDifference !=
43                9 * questionDifference / 2;
44    }
45}