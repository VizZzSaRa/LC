class Solution {
    public int alternateDigitSum(int n) {
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        int c=0,s=0;;
        while(rev!=0){
            ++c;
            if(c%2!=0) s+=(rev%10);
            else s-=(rev%10);
            rev/=10;
        }
        return s;
    }
}