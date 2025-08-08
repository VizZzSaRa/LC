class Solution {
    public int searchInsert(int[] arr, int t) {
        int lb=0;
        int ub=arr.length-1;
        while(lb<=ub){
           int mid=(lb+ub)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<t){
                lb=mid+1;
            }
            else ub=mid-1;
        }
        return lb;
        

       }
        
    }
