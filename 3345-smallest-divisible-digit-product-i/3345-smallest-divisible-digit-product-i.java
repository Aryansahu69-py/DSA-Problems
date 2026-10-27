class Solution {
    public int smallestNumber(int n, int t) {
        for(int r =n ; r <=n+t ; r++){
            int p = 1 ;
            int c = r ;
            while(c >0){
                p = p*(c%10);
                c = c/10;
            }
            if(p%t==0){
                return r;
            }
        }
        return n ;
    }
}