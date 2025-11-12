class Solution {
    public boolean isSubstringPresent(String s) {
        List<String> l = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++) l.add(s.substring(i,i+2));
        StringBuilder sb = new StringBuilder(s).reverse();
        for(String i:l){
            if(sb.toString().contains(i)) return true;
        }
        return false;
    }
}