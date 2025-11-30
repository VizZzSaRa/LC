class Solution {
    public int minimumBoxes(int[] apple, int[] nums) {
        int t=0;
        for(int i:apple) t+=i;
        Arrays.sort(nums);
        int c=0;
        int s=0;
        for(int i=nums.length-1;i>=0;i--){
            c++;
            s+=nums[i];
            if(s>=t) break;
        }
        return c;
    }
}