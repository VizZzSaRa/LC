class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr [] =new int[26];
        for(char i:s.toCharArray())
            arr[i-'a']++;
        int num =0;
        for(int i:arr){
            if(i>0){
                num=i;
                break;
            }
        }
        int tc=0;
        int c=0;
        for(int i:arr){
            if(i>0){
                tc++;
                if(i==num)c++;
            }
        }
        
        return (tc==c);
        
    }
}