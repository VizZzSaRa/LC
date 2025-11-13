class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr [] = new int [n*2];
        int l=0;
        int r=n;
        int k=0;
        for(int i=0;i<n;i++){
            arr[k++]=nums[l++];
            arr[k++]=nums[r++];
        }
        return arr;
    }
}