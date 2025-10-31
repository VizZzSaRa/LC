class Solution {
    public int countDigits(int num) {
        int n =num;
        List<Integer> l = new ArrayList<>();
        while(n!=0){
            int q=n%10;
            l.add(q);
            n/=10;
        }
        
        int c=0;
        for(int i:l){
            if(num%i==0)c++;
        }
        return c;
    }
}