class Solution {
    public int getLucky(String str, int k) {
        StringBuilder sb = new StringBuilder();
        for(char i:str.toCharArray())sb.append(i-96);
        int s=0;
        for(char i:sb.toString().toCharArray()) s+=i-'0';
        if(k==1) return s;
        while((k-1)!=0){
            int sum=0;
            while(s!=0){
                sum+=s%10;
                s/=10;
            }
            s=sum;
            k--;
        }
        return s;
    }
}