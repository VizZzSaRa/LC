class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0,t=x;
        while(t!=0){
            int q =t%10;
            rev = rev*10+q;
            t/=10;
        }
        return rev==x;
    }
}