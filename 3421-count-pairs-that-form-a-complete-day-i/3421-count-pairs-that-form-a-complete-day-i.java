class Solution {
    public int countCompleteDayPairs(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]+arr[i])%24==0) c++;
            }
        }
        return c;
    }
}