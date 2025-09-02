class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i!='i') str.append(i);
            else{
                str.reverse();
            }
        }
        return str.toString();

        
    }
}