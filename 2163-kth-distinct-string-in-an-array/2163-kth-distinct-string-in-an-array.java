class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> m = new LinkedHashMap<>();
        for(String i:arr) m.put(i,m.getOrDefault(i,0)+1);
        List<String> l = new ArrayList<>();
        for(String i:m.keySet()){
            if(m.get(i)==1) l.add(i);
        }
        String ans ="";
        if(k<=l.size()) return l.get(k-1);
        return ans;
    }
}