class Solution {
    public int search(int[] arr, int tar) {
        int n = arr.length ; 
        int s = 0 , e=n-1 , ans = -1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==tar) return mid ;
            if(arr[s] <= arr[mid]){
                if(arr[s]<=tar && tar <=arr[mid]){
                    e = mid-1;
                }else{
                    s= mid + 1 ;
                }
            }else{
                if(arr[mid] <= tar && tar <=arr[e]){
                    s = mid+1;
                }else e= mid -1 ;
            }

            
        }
        return -1;
        

    }
}