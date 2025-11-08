class Solution {
    public int uniqueMorseRepresentations(String[] mat) {
        String [] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String i:mat){
            for(char j:i.toCharArray()){
                sb.append(arr[j-'a']);
            }
            s.add(sb.toString());
            sb.setLength(0);
        }
        return s.size();
         
    }
}