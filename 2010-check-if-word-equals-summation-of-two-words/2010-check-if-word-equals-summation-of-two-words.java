class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        for(char i:firstWord.toCharArray()) sb1.append(i-'a');
        for(char i:secondWord.toCharArray()) sb2.append(i-'a');
        for(char i:targetWord.toCharArray()) sb3.append(i-'a');
        long a = Long.parseLong(sb1.toString());
        long b = Long.parseLong(sb2.toString());
        long c = Long.parseLong(sb3.toString());
        return a+b==c;
       
        
    }
}