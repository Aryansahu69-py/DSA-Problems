class Solution {
    public int findGCD(int[] nums) {
        int mn = Integer.MAX_VALUE ;
        int mx = Integer.MIN_VALUE;
        for(int n:nums){
            mn = Math.min(mn , n);
            mx = Math.max(mx , n);
        }
        return gcd( mx , mn);

    }
    public int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a ;
    }
}