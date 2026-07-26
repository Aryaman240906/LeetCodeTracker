// Last updated: 26/07/2026, 23:47:10
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3
4        HashSet<String> set = new HashSet<>(dictionary);
5
6        String[] words = sentence.split(" ");
7        StringBuilder ans = new StringBuilder();
8
9        for (int i = 0; i < words.length; i++) {
10
11            String word = words[i];
12            String replacement = word;
13            for (int j = 1; j <= word.length(); j++) {
14
15                String prefix = word.substring(0, j);
16
17                if (set.contains(prefix)) {
18                    replacement = prefix;
19                    break;         
20                }
21            }
22
23            ans.append(replacement);
24
25            if (i != words.length - 1) {
26                ans.append(" ");
27            }
28        }
29        return ans.toString();
30    }
31}
32 