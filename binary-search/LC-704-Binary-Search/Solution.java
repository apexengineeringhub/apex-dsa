class Solution {
    public int search(int[] nums, int target) {
        int left =  0;

        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] ==  target){
                return mid;
            }
            // target is small from nums[mid] then skip right part
            else if(target < nums[mid]){
                right = mid-1;
            }
            else{

                left =mid +1;
            }
        }
        // Target not found
        return -1;
    }
}