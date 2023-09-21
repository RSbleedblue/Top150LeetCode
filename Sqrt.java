class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x==1 || x==2){
            return 1;
        }
        long num = 0;
        long intPart = 0;
        for(long i = 0;i<x;i++){
            intPart = i*i;
            num = i;
            if(intPart>x){
                break;
            }
        }
        return (int)num-1;
    }
}
