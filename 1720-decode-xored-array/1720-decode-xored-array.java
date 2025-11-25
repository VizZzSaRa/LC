class Solution {
    public int[] decode(int[] nums, int first) {
        int arr[] = new int [nums.length+1];
        arr[0]=first;
        for(int i=0;i<nums.length;i++) arr[i+1]=arr[i]^nums[i];
       return arr;
    }
}