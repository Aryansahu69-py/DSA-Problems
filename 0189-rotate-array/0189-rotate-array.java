class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k %=n ;
        reverse(nums , 0 , n-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);
        
    }
    public void reverse(int []nums , int i , int j){
        while(i<j){
            /* here Two pointer approach is written so that we don not need to copy the array and increase the space complexity as JAVA is the point to reference language*/
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}