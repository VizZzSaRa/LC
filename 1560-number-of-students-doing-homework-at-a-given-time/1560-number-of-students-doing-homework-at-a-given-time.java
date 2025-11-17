class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int c=0;
        for(int i=0;i<s.length;i++){
            c+=(isC(s[i],e[i],q)) ;
        }
        return c;
    }
    int isC(int st,int end, int q){
        int c=0;
        for(int i=st;i<=end;i++){
            if(q==i) c++;
        }
        return c;
    }
}