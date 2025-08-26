class Solution {
    public int climbStairs(int n) {
        int f=1;
        int s=1;
        for(int i=1;i<=n;i++){
            int next=f+s;
            f=s;
            s=next;
        }
        return f;
        
    }
}