class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr [] = new int[26];
        for(char i:text.toCharArray()){
            arr[i-'a']++;
        }
        String ch = "balon";
        int min=Integer.MAX_VALUE;
        for(char i:ch.toCharArray()){
            if(i!='o' && i!='l'){
                if(arr[i-'a'] <min ) min=arr[i-'a'];
            }
            else if(i=='l' && (arr[i-'a']/2) < min ) min=arr[i-'a']/2;
            else if(i=='o' && (arr[i-'a']/2) < min ) min=arr[i-'a']/2;
        }
        if(arr['b'-'a']>=min && arr['a'-'a']>=min && arr['n'-'a']>=min && arr['l'-'a']>=min && arr['o'-'a']>=min ) return min ;
        return 0;
    }
}