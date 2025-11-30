class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i<=nums.length-3;i++){
            if(((double)nums[i]+(double)nums[i+2]) == ((double)nums[i+1] /2.0))c++;
        }
        return c;
    }
}