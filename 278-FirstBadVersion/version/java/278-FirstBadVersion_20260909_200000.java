// Last updated: 09/09/2026, 20:00:00
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3
4        int left = 0;
5        int right = letters.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (letters[mid] > target) {
12                right = mid - 1;
13            } else {
14                left = mid + 1;
15            }
16        }
17
18        return letters[left % letters.length];
19    }
20}