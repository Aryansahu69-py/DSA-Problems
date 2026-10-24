class Solution {
    public long countCommas(long n) {
      long c = 1000;
      long r = 0 ; 
      while(c <= n){
        r += n - c + 1 ;
        c *=1000;
      }
      return r ;  
    }
}