class Solution {
    public int findMaxK(int[] arr) {
        
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        for(int i:arr){
            if(i<0)n.add(i);
            else p.add(i);
        }
        int max=-1;
        for(int i:p){
            if(n.contains(-i)){
                if(i>max)max=i;
            }
        }
        return max;
    }
}