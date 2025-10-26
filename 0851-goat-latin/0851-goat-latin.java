class Solution {
    public String toGoatLatin(String sentence) {
        String v ="AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        String [] arr = sentence.split("\\s+");
        for(String i:arr){
            if(v.indexOf(i.charAt(0))!=-1){
                sb.append(i);
                sb.append("ma");
                sb.append(" ");
            }
            else{
                sb.append(i.substring(1,i.length()));
                sb.append(i.charAt(0));
                sb.append("ma");
                sb.append(" ");
            }

        }
        String [] ar = sb.toString().split("\\s+");
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<ar.length;i++){
            sb1.append(ar[i]);
            for(int j=0;j<=i;j++){
                sb1.append("a");
            }
            sb1.append(" ");
        }
        return sb1.toString().trim();
    }
}