class Solution {
    public int findComplement(int num) {
        String b=Integer.toBinaryString(num);
        String a="";
        for(char i:b.toCharArray()){
            if(i=='1')a+='0';
            else a+='1';
        }
        int d =Integer.parseInt(a,2);
        return d;
        
    }
}