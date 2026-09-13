class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        if(x<0 ||(x%10==0 && x!=0))
         return false ; 
        while (x > 0) {
            int lastdigit = x % 10;
            rev *= 10;
            rev += lastdigit;
            x /= 10;
        }
            return temp==rev;
        
        }

    }
