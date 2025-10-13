class Solution {
    public String capitalizeTitle(String s) {
        s=s.toLowerCase();
        String[] arr=s.split(" ");
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder str=new StringBuilder();
            if(arr[i].length()<=2){
                  str.append(arr[i]);
            } 
            else{
               str.append(Character.toUpperCase(arr[i].charAt(0)));
            str.append(arr[i].substring(1));
            arr[i]=str.toString();
            }
            str1.append(str);
          if(i!=arr.length-1)  str1.append(" ");
        }
        return str1.toString();
    }
}