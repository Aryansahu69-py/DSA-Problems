class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE ;
        int end = 0;

        for(int i : nums){
            start = Math.min(start, i);
            end = Math.max(end , i);
        }
        int fr[] = new int[end+1];
        for(int i : nums) fr[i]++;
        List<Integer> res = new ArrayList<>();
        for(int i = start ; i<=end ; i++){
            if(fr[i] == 0) res.add(i);
        }
        return res ;
    }
}