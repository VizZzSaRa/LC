class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        
        List<Integer> lR=new ArrayList<>();
        for(int i []:mat){
            int rmin=Integer.MAX_VALUE;
            for(int j:i){
                if(j<rmin) rmin=j;
            }
            lR.add(rmin);
        }
        List<Integer> lC=new ArrayList<>();
        for(int i=0;i<mat[0].length;i++){
            int cmax=0;
            for(int j=0;j<mat.length;j++){
                if(mat[j][i]>cmax) cmax=mat[j][i];
            }
            lC.add(cmax);
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:lR) m.put(i,m.getOrDefault(i,0)+1);
        for(int i:lC) m.put(i,m.getOrDefault(i,0)+1);
        List<Integer> ans = new ArrayList<>();
        for(int i:m.keySet()){
            if(m.get(i)==2) ans.add(i);
        }
        return ans;
    }
}