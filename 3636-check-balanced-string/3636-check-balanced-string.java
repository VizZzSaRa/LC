class Solution {
    public boolean isBalanced(String s){
        int e=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(i%2==0) e+=(ch-'0');
            else o+=(ch-'0');
        }
        if(e==o)return true;
        return false;
    }
}