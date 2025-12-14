class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length()-k;i+=k)   sb.append(isC(s.substring(i,i+k)));
        return sb.toString();
    }
    char isC(String s){
        int sum=0;
        for(char i:s.toCharArray()){
            sum+=i-'a';
        }
        sum%=26;
        return (char)(sum+97);
    }
    
}