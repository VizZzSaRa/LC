class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> s = new TreeSet<>();
        for(int i:nums)s.add(i);
        List<Integer> l= new ArrayList<>(s);
        System.out.println(l);
        int size=0;
        if(k>=l.size()) size=l.size();
        else size=k;
        int arr[] =new int[size];
        int a=0;
        for(int i=l.size()-1;i>=0;i--) {
        if(a<size)
        arr[a++]=l.get(i);
        }
        return arr;
    }
}