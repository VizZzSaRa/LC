class Solution {
    public int maxDifference(String s) {
        int arr[] =  new int [26];
        for(char i:s.toCharArray()) arr[i-97]++;
        System.out.println(Arrays.toString(arr));
        int om=Integer.MIN_VALUE;
        int em=Integer.MAX_VALUE;
        for(int i:arr){
            if(i%2!=0 && i>om) om=i;
            else if(i%2==0  && i<em && i!=0) em=i;
        }
        return om-em;
        
    }
}