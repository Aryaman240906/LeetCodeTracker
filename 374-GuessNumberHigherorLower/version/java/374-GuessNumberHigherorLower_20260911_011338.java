// Last updated: 11/09/2026, 01:13:38
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int left = 1;
13        int right = n;
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16            int result = guess(mid);
17            if (result == 0) {
18                return mid;
19            } 
20            else if (result == -1) {
21                right = mid - 1;
22            } 
23            else {
24                left = mid + 1;
25            }
26        }
27        return -1;
28    }
29}