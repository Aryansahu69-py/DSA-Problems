class Solution {
    public int largestAltitude(int[] g) {
        int n = g.length ; 
        int res = 0;
        int cur = 0;
        for(int i = 0 ; i<n;i++){
            cur += g[i];
            res = Math.max(res , cur);
        }
        return res ; 
    }
}