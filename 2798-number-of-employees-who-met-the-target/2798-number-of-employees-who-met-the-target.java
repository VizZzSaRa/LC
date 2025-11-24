class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] arr, int t) {
        int c=0;
        for(int i:arr){
            if(i>=t)c++;
        }
        return c;
    }
}