class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        for(int i:arr) l.add(i);
        int a[] = new int [arr.length];
        int k=0,ind=0;
        while(l.size()>0){
            List<Integer>l1 = new ArrayList<>();
            for(int i:l){
                if(Integer.bitCount(i)==k) a[ind++]=i;
                else l1.add(i);
            }
            l=l1;
            k++;
        }
        return a;
    }
}