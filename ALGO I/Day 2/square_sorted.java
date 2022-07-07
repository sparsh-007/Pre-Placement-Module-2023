class Solution {
    public int[] sortedSquares(int[] nums) {
       int start=0,end=nums.length-1,index=nums.length-1;
        int res[]=new int[nums.length];
        while(start<=end){
            if(nums[start]*nums[start]>nums[end]*nums[end]){
                res[index--]=nums[start]*nums[start];
                start++;
            }else{
                res[index--]=nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}
