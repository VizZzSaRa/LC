class Solution {
    public boolean checkTwoChessboards(String s, String t) {
        int n1=isC(s);
        int n2=isC(t);
        if((n1%2==0 && n2%2==0) || (n1%2!=0 && n2%2!=0)) return true;
        return false;
    }
    int isC(String st){
        int s=st.charAt(0)-96;
        s+=st.charAt(1)-'0';
        return s;
    }
}