// Last updated: 30/07/2026, 17:11:38
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        List<List<Integer>> ans = new ArrayList<>();
4        HashSet<Integer> map1 = new HashSet<>();
5        HashSet<Integer> map2 = new HashSet<>();
6        for (int i = 0; i < nums1.length; i++) {
7            map1.add(nums1[i]);
8        }
9        for (int i = 0; i < nums2.length; i++) {
10            map2.add(nums2[i]);
11        }
12        List<Integer> list1 = new ArrayList<>();
13        List<Integer> list2 = new ArrayList<>();
14        for (int num : map1) {
15            if (!map2.contains(num)) {
16                list1.add(num);
17            }
18        }
19        for (int num : map2) {
20            if (!map1.contains(num)) {
21                list2.add(num);
22            }
23        }
24        ans.add(list1);
25        ans.add(list2);
26        return ans;
27    }
28}