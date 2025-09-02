class Solution {
    public String reversePrefix(String s, char ch) {
        if(s.indexOf(ch)==-1) return s;
        int n=s.indexOf(ch);
        StringBuilder sb = new StringBuilder(s.substring(0,n+1)).reverse();
        StringBuilder ans = new StringBuilder(s).replace(0,n+1,sb.toString());
        return ans.toString();
        
    }
}