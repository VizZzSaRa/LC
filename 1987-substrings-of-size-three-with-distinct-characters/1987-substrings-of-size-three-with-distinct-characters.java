class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isCheck(s.substring(i,j))) c++;
            }
        }
        return c;
    }
    boolean isCheck(String s){
        if(s.length()==3){
            Set<Character> set =new HashSet<>();
            for(char i:s.toCharArray()) set.add(i);
            if(set.size()==3) return true;
        }
        return false;
    }
}