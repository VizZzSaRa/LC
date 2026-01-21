class Solution {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        if(s.length()<=3) System.out.println(s);
        int d=s.length();
        StringBuilder sb = new StringBuilder();
        int c=0;
        while(d!=0){
            d--;
            c++;
            sb.append(s.charAt(d));
            if(c%3==0) sb.append(".");
        }
        sb.reverse();
        if(s.length()%3!=0) return sb.toString();
        return sb.toString().substring(1,sb.toString().length());
    }
}