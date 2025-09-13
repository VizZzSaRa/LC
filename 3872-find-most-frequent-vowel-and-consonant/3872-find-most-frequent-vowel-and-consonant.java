class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> v = new HashMap<>();
        Map<Character,Integer> c = new HashMap<>();
        for(char i:s.toCharArray()) {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') v.put(i,v.getOrDefault(i,0)+1);
            else c.put(i,c.getOrDefault(i,0)+1);
        }
        int m1=0;
        int m2=0;
        for(char i:v.keySet()){
            if(v.get(i)>m1) m1=v.get(i);
        }
         for(char i:c.keySet()){
            if(c.get(i)>m2) m2=c.get(i);
        }
        return m1+m2;
    }
}