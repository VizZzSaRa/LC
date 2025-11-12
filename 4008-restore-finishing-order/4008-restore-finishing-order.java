class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr [] = new int [friends.length];
        int a=0;
        for(int i:order){
            for(int j:friends){
                if(i==j) arr[a++]=i;
            }
        }
        return arr;
    }
}