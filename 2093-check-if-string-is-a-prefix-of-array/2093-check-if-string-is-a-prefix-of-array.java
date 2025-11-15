class Solution {
    public boolean isPrefixString(String s, String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String i:arr){
            sb.append(i);
            if(s.equals(sb.toString())) return true;
        }
        return false;
    }
}