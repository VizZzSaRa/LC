class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int a1=0;
        int b1=0;
        String c="aeiou";
        for(int i=0;i<a.length();i++){
            if(c.contains(String.valueOf(a.charAt(i))))a1++;
            if(c.contains(String.valueOf(b.charAt(i))))b1++;
        }
        if(a1==b1) return true;
        return false;
        
    }
}