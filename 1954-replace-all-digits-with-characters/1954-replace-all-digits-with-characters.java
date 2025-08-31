class Solution {
    public String replaceDigits(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9')
            ans+=(char)(s.charAt(i-1)+(c-48));
            else ans+=c;
        }
        return ans;
    }
}