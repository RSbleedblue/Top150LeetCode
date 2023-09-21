class Solution {
    public int strStr(String haystack, String needle) {
        int resIndex = -1;
        int sizeOfWord = needle.length();
        String wordCompare = "";
        int j=0;
        int k=0;
        for(int i=0;i<haystack.length();i++){
            j=0;
            k=i;
            wordCompare = "";
            while(j<sizeOfWord && k<haystack.length()){
                wordCompare += haystack.charAt(k);
                j++;
                k++;
            }
            if(wordCompare.equals(needle)){
                resIndex = i;
                break;
            }
        }
        return resIndex;
    }
}
