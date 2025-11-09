class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int des[] =arr.clone();
        Arrays.sort(des);
        Map<Integer,Integer> m = new HashMap<>();
        int j=1;
        for(int i:des){
            if(!m.containsKey(i)) m.put(i,j++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=m.get(arr[i]);
        }
        return arr;


    }
}