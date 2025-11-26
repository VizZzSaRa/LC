class Solution {
    public int maxScore(String s) {
        int l=0,r=0;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
                l=isZ(s.substring(0,i+1));
                r=isO(s.substring(i+1,s.length()));
            if((l+r)>max) max=l+r;
        }
        return max;
    }
    int isZ(String s){
        int c=0;
        for(char i:s.toCharArray()) {
            if(i=='0') c++;
        }
        return c;
    }
    int isO(String s){
        int c=0;
        for(char i:s.toCharArray()) {
            if(i=='1') c++;
        }
        return c;
    }
}