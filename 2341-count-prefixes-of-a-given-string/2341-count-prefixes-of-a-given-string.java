class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String i:words){
            if(s.length()>=i.length()&&s.substring(0,i.length()).equals(i))c++;
        }
        return c;
        
    }
}