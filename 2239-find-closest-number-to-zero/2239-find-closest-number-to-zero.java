class Solution {
    public int findClosestNumber(int[] nums) {
        int arr[] = new int[nums.length];
        int k=0;
        for(int i:nums) arr[k++]=Math.abs(i);
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min) min=i;
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min) l.add(nums[i]);
        }
        Collections.sort(l);
        if(! l.isEmpty()&& l.size()==1) return l.get(0);
        return l.get(l.size()-1);
        
    }
}