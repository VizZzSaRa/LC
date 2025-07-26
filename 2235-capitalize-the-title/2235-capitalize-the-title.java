class Solution {
    public String capitalizeTitle(String s) {
        String ans="";
        String arr[] = s.split("\\s+");
        int j=0;
        for(String i:arr){
            if(i.length()>2){
                arr[j]=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
                j++;
            }
            else {
                arr[j]=i.substring(0).toLowerCase();
            j++;
            }
        }
        return String.join(" ",arr);

        
    }
}