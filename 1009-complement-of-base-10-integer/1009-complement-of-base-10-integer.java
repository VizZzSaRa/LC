class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='1') sb.append('0');
            else sb.append('1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}