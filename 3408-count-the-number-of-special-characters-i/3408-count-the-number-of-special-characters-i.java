class Solution {
    public int numberOfSpecialChars(String s) {
        Set<Character> low= new HashSet<>();
        Set<Character>  up=new HashSet<>();
        for(char i:s.toCharArray()){
            if(i>='a'&&i<='z') low.add(i);
            else up.add(i);
        }
        int c=0;
        int j=0;
        for(char i:low){
            j=0;
            j=(int)i-32;
            if(up.contains((char)j)) c++;
        }
        return c;
        
    }
}