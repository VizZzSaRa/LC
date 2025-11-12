class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        int sum=0;
        for(int i:m.keySet()){
            if(m.get(i)%k==0){
                sum=sum+isNum(m, i);
            }
        }
        return sum;
    }
    int isNum(Map<Integer,Integer> m, int num ){
        int sum=0;
        for(int i=0;i<m.get(num);i++) sum+=num;
        return sum;
    }
}