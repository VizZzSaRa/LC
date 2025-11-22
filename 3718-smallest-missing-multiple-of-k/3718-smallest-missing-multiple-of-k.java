class Solution {
    public int missingMultiple(int[] arr, int k) {
        List<Integer> s= new ArrayList<>();
        for(int i:arr) s.add(i);
        int n=0;
        int ans=0;
        while(s.contains(n+=k)){
            ans=n;
        }
        return n;
        
    }
}