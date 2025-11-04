class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o=n*n;
        int e=n*(n+1);
        while(e!=0){
            int temp=e;
            e=o%e;
            o=temp;
        }
        return o;
    }
}