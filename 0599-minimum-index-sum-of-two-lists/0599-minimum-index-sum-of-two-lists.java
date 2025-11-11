class Solution {
    public String[] findRestaurant(String[] s1, String[] s2) {
        Map<String,Integer> m = new LinkedHashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    m.put(s1[i],(i+j));
                    if(min>(i+j)) min=i+j;
                }
            }
        }
        List<String> l = new ArrayList<>();
        for(String i:m.keySet()){
            if(m.get(i)==min) l.add(i);
        }
        return l.toArray(new String[0]);
        
    }
}