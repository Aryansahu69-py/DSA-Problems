class Solution {
    public long maxAlternatingSum(int[] nums) {
        long res = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = nums[i]*nums[i];

        }
        Arrays.sort(nums);
        int l = 0 , r = nums.length - 1;

        while(l<=r){
            if( l == r){
                res += nums[l];
            }else{
                res  += nums[r] - nums[l];
            }
            l++;
            r--;
        }
        return res ;
    }   
}