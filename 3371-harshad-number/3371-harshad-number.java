class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x<10) return x;
        int temp=x;
        int s=0;
        while(temp!=0){
            s+=temp%10;
            temp/=10;
        }
        if(x%s==0) return s;
        else return -1;
        
    }
}