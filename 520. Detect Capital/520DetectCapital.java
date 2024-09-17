class Solution {
    public boolean detectCapitalUse(String word) {
        String s = word;
        if (s.toUpperCase().equals(word)) {
            return true;
        } else if (s.toLowerCase().equals(word)) {
            return true;
        }
        for (int j = 1; j < word.length(); j++) {
            if (word.charAt(j) >= 65 && word.charAt(j) <= 90) {
                return false;
            }
        }
        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            return true;
        }
        return false;
    }
}
