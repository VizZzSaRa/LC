class Solution {
    public int findFinalValue(int[] nums, int n) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums) l.add(i);
        while(l.contains(n)) n=2*n; 
        return n;
    }
}