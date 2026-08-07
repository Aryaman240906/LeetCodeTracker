// Last updated: 07/08/2026, 18:52:41
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : map1) {
            if (!map2.contains(num)) {
                list1.add(num);
            }
        }
        for (int num : map2) {
            if (!map1.contains(num)) {
                list2.add(num);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}