class Solution {
    public int countPairs(List<Integer> l, int target) {
        int c=0;
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                if(l.get(i)+l.get(j) <target) c++;
            }
        }
        return c;
    }
}