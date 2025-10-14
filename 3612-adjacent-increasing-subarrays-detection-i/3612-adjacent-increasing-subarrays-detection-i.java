class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> li, int k) {
        int n=li.size();
        int c=0;
        for(int i=0;i+2*k<=n;i++){
            ArrayList<Integer> lis=new ArrayList<>();
            ArrayList<Integer> lik=new ArrayList<>();
            for(int j=i;j<i+k;j++){
                lis.add(li.get(j));
            }
            for (int j=i+k;j<(i+2*k);j++) {
                lik.add(li.get(j));
            }
            if(is(lis) && is(lik)){
                return true;
            }
        }
        return false;
    }
    public static boolean is(ArrayList<Integer> li){
        for(int i=1;i<li.size();i++){
           if(li.get(i-1)>=li.get(i)){
               return false;
           } 
        }
        return true;
    }
}