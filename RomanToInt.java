import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        int prevValue = 0;
        for(int i = s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            int value = map.get(ch);
            if(value<prevValue){
                result -= value;
            }
            else{
                result+=value;
            }
            prevValue = value;
        }
        return result;
    }
    public static void main(String args[]){
        String res = "MCMXCIV";
        int result = romanToInt(res);
        System.out.println(result);
    }
}
