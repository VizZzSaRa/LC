class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int sum=0;
        for(int i:nums) sum+=i;
        int i=1;
        while(sum%k!=0){
            if(nums[nums.length-i] >0 ) {
                c++;
                nums[nums.length-i]--;
            }
            else if(i<=nums.length) i++;
            int s=0;
            for(int j:nums){ 
                s+=j;
            }
            sum=s;
        }
        return c;
        
    }
}