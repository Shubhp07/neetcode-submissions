class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> temp = new HashMap<>();
        temp.put(0,1);
        int sum = 0 , count = 0;    

        for(int i = 0 ; i< n ; i++){
            sum += nums[i];
            if(temp.containsKey(sum-k)){
                count += temp.get(sum- k );
            }
            temp.put(sum , temp.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}