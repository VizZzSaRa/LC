class Solution {
    public List<Integer> stableMountains(int[] nums, int t) {
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>t) l.add(i);
        } 
        return l;
        
    }
}