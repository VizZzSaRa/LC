class Solution {
    public int maximumNumberOfStringPairs(String[] arr) {
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            StringBuilder sb = new StringBuilder(arr[i]).reverse();
            for(int j=i+1;j<arr.length;j++){
                if(sb.toString().equals(arr[j])) c++;
            }
        }
        return c;
    }
}