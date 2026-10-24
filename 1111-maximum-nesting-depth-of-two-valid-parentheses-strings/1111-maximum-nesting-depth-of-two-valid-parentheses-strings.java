class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int c = 0;
        int r[] = new int[s.length()];
        for(int i =0; i<s.length() ;i++){
            char d = s.charAt(i);
            if(d =='('){
                c++;
                r[i] = c%2;
            }else{
                r[i] = c%2;
                c--;
            }
        }
        return r ; 
    }
}