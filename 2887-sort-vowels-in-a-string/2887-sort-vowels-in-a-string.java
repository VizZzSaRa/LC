class Solution {
    public String sortVowels(String s) {
        String v="AEIOUaeiou";
        ArrayList<Character> l = new ArrayList<>();
        for(char i:s.toCharArray()){
            if(v.indexOf(i)!=-1) l.add(i);
        }
        Collections.sort(l);
        StringBuilder sb = new StringBuilder();
        int k=0;
        for(char i:s.toCharArray()){
            if(v.indexOf(i)!=-1) sb.append(l.get(k++));
            else sb.append(i);
        }
        return sb.toString();
        
    }
}