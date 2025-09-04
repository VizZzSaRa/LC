class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for(char i:sentence.toCharArray()) s.add(i);
        return s.size()==26;
        
    }
}