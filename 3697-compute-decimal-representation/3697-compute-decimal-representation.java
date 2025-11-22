class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> l = new ArrayList<>();
        int c=0;
        int num=0;
        while(n!=0){
             num=(n%10)*(int)Math.pow(10,c);
             if(num !=0)l.add(num);
             c++;
             n/=10;
        }
        Collections.sort(l);
        int arr[]=new int[l.size()];
        int k=0;
        for(int i=l.size()-1;i>=0;i--) arr[k++] =l.get(i);
        return arr;
    }
}