// Last updated: 26/07/2026, 23:49:30
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        HashSet<String> set = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String replacement = word;
            for (int j = 1; j <= word.length(); j++) {

                String prefix = word.substring(0, j);

                if (set.contains(prefix)) {
                    replacement = prefix;
                    break;         
                }
            }

            ans.append(replacement);

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
 