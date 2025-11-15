class Solution {
    public int countPrimeSetBits(int l, int r) {
        int c=0;
        for(int i=l;i<=r;i++){
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            if(isC(sb.toString())) c++;
        }
        return c;
    }
    boolean isC(String s) {
        int c=0;
        for(char i:s.toCharArray()){
            if(i=='1') c++;
        }
        return isP(c);
    }
    boolean isP(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}