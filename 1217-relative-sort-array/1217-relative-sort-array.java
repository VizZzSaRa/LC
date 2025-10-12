class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int arr [] = new int [n];
          ArrayList<Integer> li2 = new ArrayList<>();
          for(int i:arr2) li2.add(i);
        Map<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
      
        for(int i:arr1){
            if(li2.contains(i)) m.put(i,m.getOrDefault(i,0)+1);
            else l.add(i);
        }
        Collections.sort(l);
        int ind=0;
        for(int i:arr2){
            for(int j=0;j<m.get(i);j++){
                arr[ind++]=i;
            }
        }
        for(int i:l) arr[ind++] =i;
        return arr;
        
    }
}