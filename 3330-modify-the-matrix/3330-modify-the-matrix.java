class Solution {
    public int isMax(int arr[][],int n){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][n]>max) max=arr[i][n];
        }
        return max;
    }
    public int[][] modifiedMatrix(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==-1) mat[i][j]=isMax(mat,j);
            }
        }
        return mat;
    }
}