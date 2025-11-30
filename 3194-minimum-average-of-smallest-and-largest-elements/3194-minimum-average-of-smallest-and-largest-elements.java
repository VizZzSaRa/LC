class Solution {
    public double minimumAverage(int[] nums) {
        // List<Integer> l = new ArrayList<>();
        // for(int i:nums) l.add(i);
        // List<Double> li = new ArrayList<>();
        // while(l.size()>0){
        //     int min=l.get(0);
        //     int max=l.get(0);
        //     int min_ind=0;
        //     int max_ind=0;
        //     for(int i=0;i<l.size();i++){
        //         if(l.get(i)<min){
        //             min_ind=i;
        //             min=l.get(i);
        //         }
        //         if(l.get(i)>max){
        //             max_ind=i;
        //             max=l.get(i);
        //         }
        //     }
        //     li.add((min+max)/2.0);
        //     List<Integer> l1= new ArrayList<>();
        //     for(int i=0;i<l.size();i++){
        //         if(i!=min_ind && i!=max_ind) l1.add(l.get(i));
        //     }
        //     l=l1;
        // }
        // Collections.sort(li);
        // return li.get(0);
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        Double min=Double.MAX_VALUE;
        while(l<r){
            double a=(nums[l]+nums[r]) / 2.0;
            if(a<min) min =a;
            l++;
            r--;
        }
        return min;
    }
}