class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum=0,max_sum=nums[0];
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        for(int itr:nums){
            cur_sum+=itr;
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
             if(cur_sum<0){
                cur_sum=0;
            }
        }
        return max_sum;
        
    }
}
