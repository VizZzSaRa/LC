class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> m = new TreeMap<>();
        for(int i=0;i<names.length;i++){
            m.put(heights[i],names[i]);
        }
    //     int j=names.length-1;
    //    for(int i:m.keySet()){
    //     names[j--]=m.get(i);
    //    }    
    Arrays.sort(heights);
    int j=names.length-1;
    for(int i:heights) names[j--]=m.get(i);
       return names;
    }
}