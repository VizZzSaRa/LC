class Solution {
    public int[][] flipAndInvertImage(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            int st=0;
            int end=mat[i].length-1;
            while(st<end){
                int t=mat[i][st];
                mat[i][st] =mat[i][end];
                mat[i][end] =t;
                st++;
                end--;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0) mat[i][j] =1;
                else mat[i][j]=0;
            }
        }
        return mat;
        
    }
}