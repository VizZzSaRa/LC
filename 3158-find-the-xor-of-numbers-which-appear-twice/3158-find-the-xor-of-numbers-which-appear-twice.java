class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[] = new int [51];
        for(int i=0;i<nums.length;i++) arr[nums[i]]++;
        int n=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2) n=n^i;
        }
        return n;
        
        
    }
}