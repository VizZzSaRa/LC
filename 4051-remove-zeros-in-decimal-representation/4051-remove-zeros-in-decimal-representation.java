class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i!='0')sb.append(i);
        }
        return Long.parseLong(sb.toString());
    }
}