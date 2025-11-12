class Solution {
    public int canBeTypedWords(String s, String t) {
        String arr[] = s.split("\\s+");
        int count=0;
        for(String i:arr){
            int c=0;
            for(char j:t.toCharArray()){
                if(! i.contains(String.valueOf(j))) c++;
            }
            if (c==t.length()) count++;
        }
        return count;
    }
}