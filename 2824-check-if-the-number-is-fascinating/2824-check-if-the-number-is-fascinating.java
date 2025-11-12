class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        sb.append(Integer.toString(n*2));
        sb.append(Integer.toString(n*3));
        Map<Character,Integer> m = new HashMap<>();
        for(char i:sb.toString().toCharArray()) m.put(i,m.getOrDefault(i,0)+1);
        int c=0;
        for(char i:m.keySet()){
            if(i!='0' && m.get(i)==1) c++;
        }
        return c==9;
    }
}