class Solution {
    public int smallestNumber(int n) {
        int bl=Integer.toBinaryString(n).length();
        int bc=Integer.bitCount(n) ;
        if(bl==bc) return n;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<bl;i++) sb.append('1');
        return Integer.parseInt(sb.toString(),2);
    }
}