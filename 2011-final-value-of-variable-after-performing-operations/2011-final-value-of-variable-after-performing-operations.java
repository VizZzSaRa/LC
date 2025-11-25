class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int x=0;
        for(String i:arr){
            if(i.equals("X++")) x++;
            else if(i.equals("++X")) ++x;
            else if(i.equals("X--")) x--;
            else --x;
        }
        return x;
        
    }
}