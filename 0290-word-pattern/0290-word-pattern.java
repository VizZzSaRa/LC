class Solution {
    public boolean wordPattern(String s, String t) {
        Set<Character> s1=new LinkedHashSet<>();
        Set<String> t1=new LinkedHashSet<>();
        for(char i:s.toCharArray()) s1.add(i);
        for(String i:t.split(" ")) t1.add(i);
        ArrayList<Character> l1= new ArrayList<>(s1);
        ArrayList<String> l2= new ArrayList<>(t1);
        if(s1.size()!=t1.size()) return false;
        Map<Character,String> m = new HashMap<>();
        for(int i=0;i<s1.size();i++) m.put(l1.get(i),l2.get(i));
        String comp="";
        for(char i:s.toCharArray()){
            comp+=m.get(i)+" ";
        }
        comp=comp.trim();
        if(t.equals(comp)) return true;
        return false;
    }
}