class Solution {
    public int secondHighest(String str) {
        Set<Integer> s =new TreeSet<>();
        for(char i:str.toCharArray()){
            if(i>='0' && i<='9') s.add(i-'0');
        }
        ArrayList<Integer> l = new ArrayList<>(s);
        if(l.size()<=1) return -1;
        return l.get(l.size()-2);
    }
}