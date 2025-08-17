class Solution {
    public boolean isIsomorphic(String s, String t) {
        Set<Character> s1= new LinkedHashSet<>();
        Set<Character> t1= new LinkedHashSet<>();
        for(char i:s.toCharArray()) s1.add(i);
        for(char i:t.toCharArray()) t1.add(i);
        if(s1.size()!=t1.size())return false;
        ArrayList<Character> l1 = new ArrayList<>(s1);
        ArrayList<Character> l2 = new ArrayList<>(t1);
        Map<Character,Character> m = new HashMap<>();
        for(int i=0;i<l1.size();i++) m.put(l1.get(i),l2.get(i));
        String ans ="";
        for(char i:s.toCharArray()) ans+=m.get(i);
        if(ans.equals(t)) return true;
        return false;

        
        
    }
}