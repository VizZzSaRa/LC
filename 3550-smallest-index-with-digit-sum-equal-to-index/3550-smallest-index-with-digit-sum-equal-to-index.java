class Solution {
    public int smallestIndex(int[] nums) {
        int k=0;
        for(int i:nums){
            if(i>0 && i <10) nums[k++] =i;
            else {
                nums[k++] =isC(i);
            }
        }
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums[i] && i<min) {
                c=1;
                min=i;
            }
        }
        if(c==1)return min;
        return -1;
    }
    int isC(int n){
        
            int sum=0;
            while(n!=0){
                sum+=(n%10);
                n/=10;
            }
            return sum;
        }
}