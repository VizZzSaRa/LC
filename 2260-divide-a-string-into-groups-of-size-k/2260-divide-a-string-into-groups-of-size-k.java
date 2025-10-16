class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        int a=s.length()%k;
        if(a>0)
        for(int i=0;i<k-a;i++) sb.append(fill);
        int size = sb.toString().length()/k;
        String arr [] = new String[size];
        int j=0;
        for(int i=0;i<=sb.toString().length()-k;i+=k){
            arr[j++]=sb.toString().substring(i,i+k);
        }
        return arr;
        
    }
}