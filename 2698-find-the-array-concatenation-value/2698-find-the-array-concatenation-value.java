class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long n=0;
        
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            StringBuilder sb =new StringBuilder(Integer.toString(nums[st]));
            if(st<end)
            sb.append(Integer.toString(nums[end]));
            n+=Long.parseLong(sb.toString());
            st++;
            end--;
        }
        return n;
    }
}