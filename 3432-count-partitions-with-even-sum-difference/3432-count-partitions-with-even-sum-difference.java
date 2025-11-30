class Solution {
    public int countPartitions(int[] nums) {
        int c=0;
        int l=0,r=0;
        for(int i=1;i<nums.length;i++){
            l=0;
            r=0;
            for(int j=0;j<i;j++) l+=nums[j];
            for(int j=i;j<nums.length;j++) r+=nums[j];
            if(Math.abs(l-r) %2==0) c++;
        }
        return c;
    }
}