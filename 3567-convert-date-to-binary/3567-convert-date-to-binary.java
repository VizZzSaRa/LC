class Solution {
    public String convertDateToBinary(String s) {
        String arr[] = s.split("-");
        ArrayList<Integer> l = new ArrayList<>();
        for(String i:arr)
            l.add(Integer.parseInt(i));
        int j=0;
        for(int i:l)arr[j++]=Integer.toBinaryString(i);
        String ans = String.join("-",arr);
        return ans;

        
    }
}