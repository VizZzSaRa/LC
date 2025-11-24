class Solution {
    public int countPrefixSuffixPairs(String[] arr) {
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if( arr[i].length()<=arr[j].length() && isC(arr[i] , arr[j])) c++;
            }
        }
        return c;
    }
    boolean isC(String s , String t){
        boolean px=false;
        boolean sx=false;
        if(s.equals(t.substring(0,s.length()))) px=true;
        if(s.equals(t.substring(t.length()-s.length(),t.length()))) sx=true;
        return px && sx;
    }
}