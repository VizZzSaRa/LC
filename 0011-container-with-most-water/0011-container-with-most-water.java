class Solution {
    public int maxArea(int[] arr) {
        int st =0;
        int end =arr.length-1;
        int max=0;
        int h=0,b=0,a=0;
        while(st<end){
            h =Math.min(arr[st],arr[end]);
            b =end-st;
            a=h*b;
            max=Math.max(max,a);
            if(arr[st]<=arr[end]) st++;
            else end--;
        }
        return max; // By CampG Training Sir From TN
    }
}