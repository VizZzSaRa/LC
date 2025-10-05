class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();
        for(char i:str.toCharArray()){
            if(!s.isEmpty()&&s.peek()==i) s.pop();
            else s.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(char i:s) sb.append(i);
        return sb.toString();
        
    }
}