class Solution {
    public boolean isAcronym(List<String> l, String s) {
        String ans="";
        for(String i:l) ans+=i.substring(0,1);
        return ans.equals(s);
        
    }
}