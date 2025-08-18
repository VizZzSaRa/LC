class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> m =  new LinkedHashMap<>();
        for(char i:s.toCharArray()) m.put(i,m.getOrDefault(i,0)+1);
        char comp='a';
        boolean f=false;
        for(char i:m.keySet()){
            if(m.get(i)==1){
                f=true;
                comp=i;
                break;
            }
        }
        int ans =-1;
        if(f){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==comp){
                    ans=i;
                    break;
                }
            }
        }
        return ans;
        
    }
}