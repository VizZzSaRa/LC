class Solution {
    public char slowestKey(int[] arr, String s) {
        int ar [] = new int[arr.length];
        int max = arr[0];
        ar[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ar[i]=Math.abs(arr[i]-arr[i-1]);
            if(ar[i]>max) max=ar[i];
        }        
        List<Character> l = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i]==max)l.add(s.charAt(i));
        }
        if(l.size()>1){
            Collections.sort(l);
            return l.get(l.size()-1);
        }
        return l.get(0);
    }
}