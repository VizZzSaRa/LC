class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n=0;
        for(int i:nums){
            if(i%2==0) n=n|i;
        }
        return n;
        
    }
}