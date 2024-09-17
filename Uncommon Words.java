import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] str1Arr = s1.split(" ");
        String[] str2Arr = s2.split(" ");

        for (String each : str1Arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        for (String each : str2Arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
