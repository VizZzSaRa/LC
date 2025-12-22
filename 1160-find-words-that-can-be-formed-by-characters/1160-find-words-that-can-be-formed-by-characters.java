class Solution {
    public int countCharacters(String[] words, String s) {
        int arr [] = new int [26];
        for(char i:s.toCharArray()) arr[i-'a']++;
        int sum=0;
        for(String i:words){
            int arr1 [] = new int [26];
            for(char j:i.toCharArray()) arr1[j-'a']++;
            if(isC(arr,arr1)) sum+=i.length();
        }
        return sum;
    }
        boolean isC(int arr[],int arr1[]){
            for(int i=0;i<arr1.length;i++){
                if( arr[i]<arr1[i]) return false;
            }
             return true; 
    }
}