class Solution {
    public String[] findOcurrences(String s, String first, String second) {
        ArrayList<String> l = new ArrayList<>();
        String []arr= s.split("\\s+");
        for(int i=0;i<arr.length-2;i++){
            if(arr[i].equals(first)&&arr[i+1].equals(second)){
                l.add(arr[i+2]);
            }
        }
        String [] ans = new String [l.size()];
        int i=0;
        for(String j:l) ans[i++]=j;
        return ans;
        
    }
}