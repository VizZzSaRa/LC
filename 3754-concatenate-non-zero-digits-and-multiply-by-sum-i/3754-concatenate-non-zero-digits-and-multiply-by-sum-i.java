class Solution {
    public long sumAndMultiply(int n) {
        int rev =0;
        while(n!=0){
            int q=n%10;
            if(q!=0) rev=rev*10+q;
            n/=10;
        }
        long num=0;
        long s=0;
        while(rev!=0) {
            int q=rev%10;
            num=num*10+q;
            s+=q;
            rev/=10;
        }
        return  (long)num*(long)s;
    }
}