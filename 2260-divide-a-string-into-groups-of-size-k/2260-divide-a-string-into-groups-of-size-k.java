class Solution {
    public String[] divideString(String s, int k, char fill) {
        if(s.length()%k!=0){
            int n= s.length()%k;
            for(int i=0;i<k-n;i++){
                s+=fill;
            }
        }
        String [] arr = new String [s.length()/k];
        int j=0;
        for(int i=0;i<s.length();i+=k){
            arr[j++]=s.substring(i,i+k);
        }

        return arr;
         
    }
}