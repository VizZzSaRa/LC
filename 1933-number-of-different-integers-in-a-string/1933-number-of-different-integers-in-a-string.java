import java.math.*;
class Solution {
    public int numDifferentIntegers(String s) {
        String [] arr = s.replaceAll("[a-z,A-Z]"," ").trim().split("\\s+");
        Set<BigInteger> set = new HashSet<>();
        for(String i:arr){
            if(!i.isEmpty()) set.add(new BigInteger(i));
        }
        return set.size();
    }
}