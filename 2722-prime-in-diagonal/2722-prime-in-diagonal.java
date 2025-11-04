class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j&& isCh(nums[i][j]) && !l.contains(nums[i][j]))  l.add(nums[i][j]);
                if(j==(nums.length-1)-i && isCh(nums[i][j]) && !l.contains(nums[i][j]))  l.add(nums[i][j]);
            }
        }
        Collections.sort(l);
        if(l.isEmpty()) return 0;
        return l.get(l.size()-1);
        
    }
    boolean isCh(int a){
        if(a<=1) return false;
        if(a<=3) return true;
        for(int i=2;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}