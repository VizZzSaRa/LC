class Solution {
    public int minimizedStringLength(String s) {
        int arr[] = new int[26];
        for(char i:s.toCharArray())
        arr[i-'a']++;
        int c=0;
        for(int i:arr){
            if(i!=0)c++;
        }
        return c;
    }
}