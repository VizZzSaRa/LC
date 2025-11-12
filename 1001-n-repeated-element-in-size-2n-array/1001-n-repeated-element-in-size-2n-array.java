class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        int n  = nums.length/2;
        for(int i:m.keySet()){
            if(m.get(i)==n) return i;
        }
        return 0;
    }
}