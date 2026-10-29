class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0 ;
        int need = 0 ;
        for(char ch : s.toCharArray()){
            if (ch =='('){
                o++;
            }else{
                if(o > 0){
                    o--;
                }else{
                    need++ ;
                }
            }
        }
        return o + need;
    }
}