class Solution {
    public int minimizedStringLength(String str) {
        
        Set<Character> s = new HashSet<>();
        for(char i:str.toCharArray()) s.add(i);
        return s.size();
    }
}