// Last updated: 30/08/2026, 19:17:41
1class Solution {
2    public int countValidWords(String sentence) {
3        String[] words = sentence.split(" ");
4        int count = 0;
5        for (String word : words) {
6            if (word.length() == 0) {
7                continue;
8            }
9            int hyphen = 0;
10            int punctuation = 0;
11            boolean valid = true;
12            for (int i = 0; i < word.length(); i++) {
13                char c = word.charAt(i);
14                if (Character.isDigit(c)) {
15                    valid = false;
16                    break;
17                }
18                if (c == '-') {
19                    hyphen++;
20
21                    if (hyphen > 1 ||
22                        i == 0 ||
23                        i == word.length() - 1 ||
24                        !Character.isLetter(word.charAt(i - 1)) ||
25                        !Character.isLetter(word.charAt(i + 1))) {
26                        valid = false;
27                        break;
28                    }
29                }
30                if (c == '!' || c == '.' || c == ',') {
31                    punctuation++;
32                    if (punctuation > 1 || i != word.length() - 1) {
33                        valid = false;
34                        break;
35                    }
36                }
37            }
38            if (valid) {
39                count++;
40            }
41        }
42        return count;
43    }
44}