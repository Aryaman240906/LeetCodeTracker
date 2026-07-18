// Last updated: 18/07/2026, 23:59:21
class Solution {
    public String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        for (String dir : path.split("/")) {

            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            if (dir.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.removeLast();
                }

            } else {
                stack.addLast(dir);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String dir : stack) {
            ans.append("/").append(dir);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}