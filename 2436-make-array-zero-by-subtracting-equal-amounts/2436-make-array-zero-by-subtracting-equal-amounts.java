class Solution {
    public int minimumOperations(int[] arr) {
        int z[] = new int[arr.length];
        int c=0;
        int min=0;
        while(! Arrays.equals(z,arr)){
            c++;
            min=isMin(arr);
            isChange(min,arr);
        }
        return c;
    }
    int isMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min && i!=0) min=i;
        }
        return min;
    }
    void isChange(int min, int arr []){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) arr[i]-=min;
        }
    } 
}