class Solution {
    public int maxProduct(int n) {
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(n!=0){
            l.add(n%10);
            n/=10;
        }
        Collections.sort(l);
        return l.get(l.size()-1)*l.get(l.size()-2);
        
    }
}