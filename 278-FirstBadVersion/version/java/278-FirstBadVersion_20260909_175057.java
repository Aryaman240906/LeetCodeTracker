// Last updated: 09/09/2026, 17:50:57
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1;
7        int right = n;
8        while(left<=right){
9            int mid = left + (right-left)/2;
10            if(isBadVersion(mid)){
11                if(!isBadVersion(mid-1)){
12                    return mid;
13                }else{
14                    right = mid-1;
15                }
16            }else{
17                left = mid+1;
18            }
19        }
20        return -1;
21    }
22}