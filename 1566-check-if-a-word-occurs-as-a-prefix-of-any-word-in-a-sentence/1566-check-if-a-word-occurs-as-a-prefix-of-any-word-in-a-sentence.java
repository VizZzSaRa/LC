class Solution {
    public int isPrefixOfWord(String s, String t) {
        int ind=-1;
        int n =t.length();
        String arr[] =s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>=n){
                if(arr[i].substring(0,n).equals(t)){
                    ind =i+1;
                    break;
                }
            }
        }
        return ind;   
    }
}