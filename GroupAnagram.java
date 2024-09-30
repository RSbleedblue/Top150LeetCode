class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answerList = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; 
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue; 
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true; 
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true; 
               }
            }
            answerList.add(group);
        }
        return answerList;
    }
    private boolean isAnagram(String source, String target){
        if(source.length() != target.length()){
            return false;
        }
        int aux[] = new int[26];
        for(int i = 0; i < source.length(); i++){
            aux[source.charAt(i) - 97]++;
            aux[target.charAt(i) - 97]--;
        }
        for(int each : aux){
            if(each != 0){
                return false;
            }
        }
        return true;
    }
}
