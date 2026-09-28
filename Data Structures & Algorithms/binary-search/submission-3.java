class Solution {
    public int search(int[] nums, int target) {
        return test(nums , 0 , nums.length-1 , target);
    }

    public int test(int[] nums , int low , int high , int target){

        int n = nums.length;

        while(low<=high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                return test(nums , mid+1 , high , target);
            }else{
                return test(nums , low , mid-1 , target);
            }
        }
        return -1;
    }
}
