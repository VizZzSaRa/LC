class Solution {
    public String reverseWords(String s) {
        String arr []= s.split("\\s+");
        int j=0;
        for(String i:arr){
             StringBuilder str = new StringBuilder(i);
            arr[j++]=String.valueOf(str.reverse());
        }
        String ans = String.join(" ",arr);
        return ans;
        
    }
}