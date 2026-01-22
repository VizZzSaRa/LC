class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.toString().contains("AB") || sb.toString().contains("CD")) {
          //  String Builder sb1 = new StringBuilder();
            for(int i=0;i<sb.toString().length()-1;i++){
                char c=sb.toString().charAt(i);
                char c1=sb.toString().charAt(i+1);
                if((c=='A' && c1=='B') || (c=='C' && c1=='D' )) sb.delete(i,i+2);
                //System.out.println(sb.toString());
            }
        }
        return sb.toString().length();
    }
}