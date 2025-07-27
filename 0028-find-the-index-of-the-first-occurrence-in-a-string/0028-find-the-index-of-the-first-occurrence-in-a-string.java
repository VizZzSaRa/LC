class Solution {
    public int strStr(String s, String t) {
        int ind=-1;
        if(s.length()>=t.length()){
            for(int i=0;i<=s.length()-t.length();i++){
            if(s.substring(i,t.length()+i).equals(t)){
                ind=i;
                break;
            }
        }
        }
        
        return ind;
        
    }
}