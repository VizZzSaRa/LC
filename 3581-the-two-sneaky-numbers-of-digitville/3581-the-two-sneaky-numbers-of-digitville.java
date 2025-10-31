class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        Map<Integer,Integer> m =new HashMap<>();
        for(int i:arr) m.put(i,m.getOrDefault(i,0)+1);
        for(int i:m.keySet()){
            if(m.get(i)>1) l.add(i);
        }
        int a[]= new int[2];
        a[0]=l.get(0);
        a[1]=l.get(1);
        return a;
    }
}