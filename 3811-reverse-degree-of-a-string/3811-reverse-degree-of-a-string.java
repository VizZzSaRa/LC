class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int a=1;
        for(char c='z';c>='a';c--)
        m.put(c,a++);
        int n =0;
        int j=1;
        for(char i:s.toCharArray())
            n+=((j++)*m.get(i));
        return  n;
    }
}