class Solution {
    public String clearDigits(String str) {
        Stack<Character> s = new Stack<>();
        for(char i:str.toCharArray()){
            if(!s.isEmpty()&& (i>='0'&&i<='9')){
                s.pop();
            }
            else s.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for(char i:s)sb.append(i);
        return sb.toString();
        
    }
}