class Solution {
    public int findSpecialInteger(int[] arr) {
        int n= (25*arr.length)/100;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr) m.put(i,m.getOrDefault(i,0)+1);
        int c=0;
        for(int i:m.keySet()){
            if(m.get(i)>n) c=i;
        }
        return c;
        
    }
}