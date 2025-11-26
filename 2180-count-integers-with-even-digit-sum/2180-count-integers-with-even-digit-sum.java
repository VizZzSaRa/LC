class Solution {
    public int countEven(int num) {
        int c=0,t=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            t=i;
            while(t>0){
                sum+=t%10;
                t/=10;
            }
            if(sum%2==0) c++;
        }
        return c;
    }
}