class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;
        Set<Float> s= new HashSet<>();
        while(st<end){
            s.add((float)(nums[st]+nums[end])/2);
            st++;
            end--;
        }
        return s.size();
    }
}