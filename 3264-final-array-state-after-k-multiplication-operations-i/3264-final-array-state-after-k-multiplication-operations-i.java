class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int a=0;
        while(a++ <k){
            int ind=0;
            int min=Integer.MAX_VALUE;
            int min_ind=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    ind=i;
                    min=nums[i];
                }
            }
            if(ind<min_ind) min_ind=ind;
            nums[min_ind]=nums[min_ind]*m;
        }
        return nums;
        
    }
}