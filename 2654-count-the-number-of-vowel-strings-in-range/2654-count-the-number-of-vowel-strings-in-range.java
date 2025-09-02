class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        String s ="AEIOUaeiou";
        for(int i=left;i<=right;i++){
            if(s.indexOf(words[i].charAt(0))!=-1&&s.indexOf(words[i].charAt(words[i].length()-1))!=-1) c++;
        }
        return c;
    }
}