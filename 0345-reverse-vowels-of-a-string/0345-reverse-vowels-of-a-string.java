class Solution {
    public String reverseVowels(String s) {
        String v="AEIOUaeiou";
        char arr [] = s.toCharArray();
        int st =0;
        int end =arr.length-1;
        while(st<end){
            while (st<end  && v.indexOf(arr[st])==-1) st++;
            while (st<end  && v.indexOf(arr[end])==-1) end--;
            char t=arr[st];
            arr[st]=arr[end];
            arr[end]=t;
            st++;
            end--;
        }
       String ans = new String (arr);
        return ans;
    }
}