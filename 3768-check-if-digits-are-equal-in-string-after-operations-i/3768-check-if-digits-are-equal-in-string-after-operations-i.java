class Solution {
    public boolean hasSameDigits(String s) {
        int len =s.length();
    while(len>2){
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            int n =((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
             ans+=String.valueOf(n);
        }
        s=ans;
        len=s.length();
    }
    if(s.charAt(0)==s.charAt(1))
    return true;
    return false;
        
    }
}