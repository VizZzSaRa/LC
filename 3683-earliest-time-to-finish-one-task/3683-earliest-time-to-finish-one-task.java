class Solution {
    public int earliestTime(int[][] mat) {
        int min=Integer.MAX_VALUE;
        int s=0;
        for(int i [] :mat){
            s=0;
            for(int j:i){
                s+=j;
            }
            if(s<min) min=s;
        }
        return min;
    }
}