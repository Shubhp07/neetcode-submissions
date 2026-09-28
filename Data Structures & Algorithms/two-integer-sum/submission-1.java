class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer ,Integer> temp = new HashMap<>();

        for(int i = 0 ; i<n ;i++){
            int compliment = target - nums[i];

            if(temp.containsKey(compliment)){
                return new int[]{temp.get(compliment),i};
            }
            temp.put(nums[i],i);
        }
        return new int[]{};
    }
}
