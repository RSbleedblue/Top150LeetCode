class Solution {
    public int lengthOfLastWord(String s) {
        String charArray[] = s.split(" ");
        int lastIndex = charArray.length-1;
        String str = charArray[lastIndex];
        return str.length();
    }
}
