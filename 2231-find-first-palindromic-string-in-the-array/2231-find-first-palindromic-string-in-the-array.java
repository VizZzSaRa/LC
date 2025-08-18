class Solution {
    public String firstPalindrome(String[] arr) {
        String ans="";
        for(String i:arr){
            StringBuilder s= new StringBuilder(i);
            if(i.equals(String.valueOf(s.reverse()))){
                ans=i;
                break;
            }
        }
        return ans;
    }
}