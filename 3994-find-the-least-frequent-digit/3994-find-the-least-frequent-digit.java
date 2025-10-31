class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> m = new HashMap<>();
        while(n!=0){
            m.put(n%10,m.getOrDefault(n%10,0)+1);
            n/=10;   
        }
        int min=Integer.MAX_VALUE;
        List<Integer> l = new ArrayList<>();
        for(int i:m.keySet()){
            if(min>m.get(i)) min=m.get(i);
        }
        for(int i:m.keySet()){
            if(m.get(i)==min){
                l.add(i);
            }
        }
        
            Collections.sort(l);
            return l.get(0);
        
    }
}