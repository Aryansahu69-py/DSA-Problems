class Solution {
    public boolean uniformArray(int[] nums1) {
        int min  = nums1[0];
        boolean odd = false ;

        for( int i : nums1){
            min = Math.min(min , i );
            if(i%2 ==1){
                odd = true ;
            }
        }
        if (min%2 == 1) return true ;
        return !odd ; 

    }
}