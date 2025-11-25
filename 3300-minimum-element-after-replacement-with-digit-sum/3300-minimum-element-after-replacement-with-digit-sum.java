class Solution {
    public int minElement(int[] nums) {
        int k=0,rev=0;
        for(int i:nums){
            rev=0;
            while(i!=0){
                rev +=i%10;
                i/=10;
            }
            nums[k++]=rev;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}