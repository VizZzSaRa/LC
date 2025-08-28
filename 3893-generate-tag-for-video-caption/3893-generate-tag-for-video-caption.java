class Solution {
    public String generateTag(String s) {
        s=s.trim().toLowerCase();
        String arr [] = s.split("\\s+");
        if(arr.length==1){
            if(arr[0].length()>=100) return "#"+arr[0].substring(0,99);
            else return "#"+arr[0];
        }
        String ans ="#";
        for(int i=1;i<arr.length;i++)
         arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length());
         
        for(String i:arr) ans+=i;
        if(ans.length()>100) ans = ans.substring(0,100);
        return ans;
        
    }
}