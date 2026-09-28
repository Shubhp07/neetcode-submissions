
class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> tem = new HashSet<>();
       for(int i = 0 ; i<nums.length ; i++){
            if(tem.contains(nums[i])){
                return true;
            }
            tem.add(nums[i]);
       }
        return false;
    }
    
}
