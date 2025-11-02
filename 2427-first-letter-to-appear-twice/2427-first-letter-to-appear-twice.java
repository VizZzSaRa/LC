class Solution {
    public char repeatedCharacter(String str) {
        Set<Character> s= new HashSet<>();
        char c='a';
        for(char i:str.toCharArray()){
            if(s.contains(i)) {
                c=i;
                return c;
            }
            else s.add(i);
        }
        return c;
    }
}