class Solution {
    public boolean canConstruct(String s2, String s1) {
         Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i = 0;i<s2.length();i++) {
            char ch = s2.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()<0){
                return false;
            }
        }
        return true;
    }
}
