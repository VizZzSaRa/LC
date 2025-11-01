class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n/=10;
            }
            if(s.contains(sum)) return false;
            s.add(sum);
            n=sum;
        }
        return true;
    }
}