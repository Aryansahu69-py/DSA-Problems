class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        if(x>0){
            while(x>0){
            int ld= x%10;
            rev *=10;
            rev += ld;
            
            x /=10;
            }
            
        }else if(x<0){
            x *= (-1);
            while(x>0){
            int ld= x%10;
            rev *=10;
            rev += ld;
           
            x /=10;
            }
            rev *= (-1);
            
        }
        if (rev < Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
        return (int)rev ;
    }
   
}