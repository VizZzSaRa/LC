class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean f =false;
        for(int i=0;i<=n/2;i++)
        {
            long pov=(long)Math.pow(2,i);
            if(pov==(long)n)
            {
                f=true;
            }
            if(pov>(long)n)
            break;
        }
        return f;
        
    }
}