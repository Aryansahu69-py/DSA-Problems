class Solution {
    public int maximumLengthSubstring(String s) {
        int fq[] = new int[26];
        int start = 0 ;
        int res = 0;
        for(int i = 0 ; i <s.length() ; i++){
            int idex = s.charAt(i) -'a';

            while(fq[idex] >= 2){
                fq[s.charAt(start) -'a']--;
                start ++;
            }
            fq[idex]++;
            res = Math.max(res , i-start+1);
        }
        return res ; 
    }
}