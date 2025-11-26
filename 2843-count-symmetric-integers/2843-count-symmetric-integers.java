class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if( Integer.toString(i).length()%2==0 && isC(Integer.toString(i))){
                c++;
            }
        }
        return c;
    }
    boolean isC(String s){
        int n=s.length();
        int l=0,r=0;
        for(int i=0;i<n/2;i++) l+=s.charAt(i)-'0';
        for(int i=n/2;i<n;i++) r+=s.charAt(i)-'0';
        return l==r;
    }
}