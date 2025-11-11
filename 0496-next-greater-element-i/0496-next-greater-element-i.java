class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=isG(nums2, nums2[j], j);
                    break;
                }
            }
        }
        return nums1;
    }
    int isG(int arr[], int tar, int ind){
        for(int i=ind;i<arr.length;i++){
            if(arr[i]>tar) return arr[i];
        }
        return -1;
    }
}