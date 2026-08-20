// Last updated: 20/08/2026, 19:32:08
1class Solution {
2    public int[] resultArray(int[] nums) {
3
4        ArrayList<Integer> arr1 = new ArrayList<>();
5        ArrayList<Integer> arr2 = new ArrayList<>();
6
7        arr1.add(nums[0]);
8        arr2.add(nums[1]);
9
10        for (int i = 2; i < nums.length; i++) {
11
12            if (arr1.get(arr1.size() - 1) >
13                arr2.get(arr2.size() - 1)) {
14
15                arr1.add(nums[i]);
16
17            } else {
18
19                arr2.add(nums[i]);
20            }
21        }
22
23        int[] result = new int[nums.length];
24
25        int index = 0;
26
27        for (int num : arr1) {
28            result[index++] = num;
29        }
30
31        for (int num : arr2) {
32            result[index++] = num;
33        }
34
35        return result;
36    }
37}