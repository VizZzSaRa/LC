class Solution {
    public int percentageLetter(String s, char ch) {
        int c =0;
        for(char i :s.toCharArray()){
            if(i==ch) c++;
        }
        return Math.round(c*100/s.length()); 
        
    }
}