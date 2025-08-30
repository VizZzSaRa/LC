class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> l = new ArrayList<>();
        for(String i:words){
            if(i.contains(""+separator)){
                String arr[] = i.split("\\"+separator);
                for(String j:arr) {
                    if(j.length()>=1)
                    l.add(j.trim());
                }
            }
            else l.add(i);
        }
        return l;
        
    }
}