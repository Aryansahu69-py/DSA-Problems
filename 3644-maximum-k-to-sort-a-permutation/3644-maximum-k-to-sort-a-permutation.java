class Solution {
    public int sortPermutation(int[] nums) {
        int r = -1 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                r &= nums[i];
                if(r==0) return 0;
            }
        }
        return Math.max(r,0) ;
    }
}