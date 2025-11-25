class Solution {
    public int smallestEqual(int[] nums) {
        List<Integer> l =  new ArrayList<>();
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                f=true;
                l.add(i);
            }
        }
        if(f) return l.get(0);
        return -1;
        
    }
}