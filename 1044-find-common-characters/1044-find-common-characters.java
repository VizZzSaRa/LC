class Solution {
    public List<String> commonChars(String[] arr) {
        List<String> l = new ArrayList<>();
        int c=0;
        for(char i:arr[0].toCharArray()){
            c=0;
            for(int j=1;j<arr.length;j++){
                if(arr[j].indexOf(i)!=-1) c++;
            }
            if(arr.length-1 == c) {
                l.add(String.valueOf(i));
                isD(i, arr);
            }
        }
        return l;
        
    }
    void isD(char tar, String [] arr){
        for(int i=1;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.deleteCharAt(arr[i].indexOf(tar));
            arr[i] = sb.toString();
            sb.setLength(0);
        }
    }
}