class Solution {
    public String[] findRelativeRanks(int[] n) {
        int narr[] = new int[n.length];
        System.arraycopy(n, 0, narr, 0, n.length);
        Arrays.sort(n);
        Map<Integer,String> m = new HashMap<>();
        int c=0;
        for(int i=n.length-1;i>=0;i--)
        {
            c++;
            if(c==1) m.put(n[i],"Gold Medal");
            else if(c==2) m.put(n[i],"Silver Medal");
            else if(c==3) m.put(n[i],"Bronze Medal");
            else {
                m.put(n[i],Integer.toString(c));
            }
        }
       String arr [] = new String [n.length];
       int j=0;
       for(int i:narr) arr[j++]=m.get(i);
       return arr;
    }
}