class Solution {
    public boolean areNumbersAscending(String s) {
        String arr[] = s.split("\\s+");
        List<Integer> l = new ArrayList<>();
        for(String i:arr){
            if(i.trim().matches("\\d+")) l.add(Integer.parseInt(i));
        }
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>=l.get(i+1)) return false;
        }
        return true;
        
    }
}