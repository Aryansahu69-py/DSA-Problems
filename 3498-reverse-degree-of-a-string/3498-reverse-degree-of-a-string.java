class Solution {
    public int reverseDegree(String s) {
        int r = 0;
        for(int i = 0 ; i<s.length() ; i++){
            int v = 26-(s.charAt(i) -'a');
            r += v*(i+1);

        }
        return r ;
    }
}