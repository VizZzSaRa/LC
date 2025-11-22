class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
         List<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
            if(i>max) max=i;
            if(i<min) min=i;
        }
        List<Integer> l1=new ArrayList<>();
        for(int i =min;i<=max;i++){
            if(! l.contains(i)) l1.add(i);
        }  
        return l1;   
    }
}