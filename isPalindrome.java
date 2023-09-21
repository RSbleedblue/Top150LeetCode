class Solution {
    public boolean isPalindrome(String s) {
        boolean res = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        StringBuilder comp = new StringBuilder(sb).reverse();

        if (comp.toString().equals(sb.toString())) {
            res = true;
        }
        
        return res;
    }
}
