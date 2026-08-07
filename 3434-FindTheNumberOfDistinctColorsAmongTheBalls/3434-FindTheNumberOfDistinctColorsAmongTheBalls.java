// Last updated: 07/08/2026, 18:51:41
class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        HashMap<Integer, Integer> ballToColor = new HashMap<>();
        HashMap<Integer, Integer> colorFreq = new HashMap<>();
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];
            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                colorFreq.put(oldColor, colorFreq.get(oldColor) - 1);
                if (colorFreq.get(oldColor) == 0) {
                    colorFreq.remove(oldColor);
                }
            }
            ballToColor.put(ball, newColor);
            if (colorFreq.containsKey(newColor)) {
                colorFreq.put(newColor, colorFreq.get(newColor) + 1);
            } else {
                colorFreq.put(newColor, 1);
            }
            ans[i] = colorFreq.size();
        }
        return ans;
    }
}