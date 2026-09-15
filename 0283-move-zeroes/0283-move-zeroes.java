class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int copy[] = new int[n];
       int s = 0 , e = n-1;
       for(int i = 0 ; i<n ; i++){
        if (nums[i] !=0) copy[s++] = nums[i];
        else copy[e--] = nums[i]; 
        }
        for(int j = 0 ; j<n ; j++){
            nums[j] = copy[j];
        }
        
        

    }
}