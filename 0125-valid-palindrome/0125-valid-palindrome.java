class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int p = 0, q= s.length()-1;
        while(p<q){
            char c1 = s.charAt(p) , c2 = s.charAt(q);
            if(!Character.isLetterOrDigit(c1)){
                p++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                q--;
                continue;
            }
            if(c1!=c2)
                return false;
            
        p++;
        q--;
            
        }
        return true;
    }
}