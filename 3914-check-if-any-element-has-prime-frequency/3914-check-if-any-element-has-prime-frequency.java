class Solution {

    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;

    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        boolean f=false;
        for(int i:m.keySet()){
            if(isPrime(m.get(i))) {
                f=true;
                break;
            }
        }
        if(f) return true;
        return false;
    }
}