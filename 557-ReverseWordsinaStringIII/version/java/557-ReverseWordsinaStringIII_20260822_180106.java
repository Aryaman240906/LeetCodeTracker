// Last updated: 22/08/2026, 18:01:06
1class Solution {
2    private void reverse(char[] arr , int left , int right){
3        while(left<right){
4            char temp = arr[left];
5            arr[left] = arr[right];
6            arr[right] = temp;
7            left++;
8            right--;
9        }
10    }
11    public String reverseWords(String s){
12        char[] arr = s.toCharArray();
13        int start = 0;
14        for(int end=0; end<s.length(); end++){
15            if(arr[end]==' '){
16                reverse(arr, start, end-1);
17                start = end+1;
18            }
19        }
20        reverse(arr, start, arr.length-1);
21        return new String(arr);
22    }
23}