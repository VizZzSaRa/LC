class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) mat[i][j]=(i*n)+j;
        }
        int i=0,j=0;
        for(String k:commands){
            if(k.equals("UP")) i-=1;
            else if(k.equals("DOWN")) i+=1;
            else if(k.equals("LEFT")) j-=1;
            else j+=1;
        }
        return mat[i][j];
    }
}