// Last updated: 22/08/2026, 21:50:44
1class Solution {
2    public int compress(char[] chars) {
3        int read = 0;
4        int write = 0;
5        while(read<chars.length){
6            int current_count = 0;
7            char current_char = chars[read];
8            while(read<chars.length && chars[read]==current_char){
9                read++;
10                current_count++;
11            }
12            chars[write++] = current_char;
13            if(current_count>1){
14                String count = String.valueOf(current_count);
15                for(char digit : count.toCharArray()){
16                    chars[write++] = digit;
17                }
18            }
19        }
20        return write;
21    }
22}