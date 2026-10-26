class Solution {
    public int maxProduct(int[] nums) {
        int m1 = 0;
        int m2 = 0;
        for(int n : nums){
            m2 = Math.max(m2 , Math.min(m1,n));
            m1 = Math.max(m1,n);
        }
        return(m1 - 1)*(m2-1);
    }
}