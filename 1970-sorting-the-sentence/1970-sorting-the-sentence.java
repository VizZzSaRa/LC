class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split("\\s+");
   //     StringBuilder a[] = new StringBuilder[arr.length];
   //     for(int i=0;i<arr.length;i++)sb[i] = new StringBuider(arr[i]);
        Map<Integer,String> m = new HashMap<>();
        for(String i:arr){
            m.put((int)(i.charAt(i.length()-1)-'0'),i.substring(0,i.length()-1));
        }
       StringBuilder sb = new StringBuilder();
       for(int i:m.keySet()) {
        sb.append(m.get(i));
        sb.append(" ");
        }
        String ans= sb.toString().trim();
        return ans;
    }
}