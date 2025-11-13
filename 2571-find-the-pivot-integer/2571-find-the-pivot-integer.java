class Solution {
    public int pivotInteger(int n) {
        int ans=-1;
        for(int i=1;i<=n;i++){
            int l=isL(i);
            int r=isR(i,n);
            if(l==r) ans=i;
        }
        return ans;
    }
    int isL(int n){
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        return sum;
    }
    int isR(int st,int end){
        int sum=0;
        for(int i=st;i<=end;i++) sum+=i;
        return sum;
    }
}