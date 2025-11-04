class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
            if(i<10) l.add(i);
            else{
                if(i>9&&i%10==0){
                    for(char j:Integer.toString(i).toCharArray()){
                        l.add(j-'0');
                    }
                }
                else{
                    int rev=isR(i);
                    while(rev!=0){
                         l.add(rev%10);
                        rev/=10;
                     }
                }
            }
        }
        int arr[]= new int[l.size()];
        int k=0;
        for(int i:l) arr[k++]=i;
        return arr ;
    }
    int isR(int n){
        int a=0;
        while(n!=0){
            int q=n%10;
            a=a*10+q;
            n/=10;
        }
        return a;
    }
}