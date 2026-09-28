class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        Arrays.sort(nums);

        int res = 0 , curr = nums[0] , strak = 0 , i = 0;

        while(i<n){
            if(nums[i]!= curr){
                curr= nums[i];
                strak = 0;
            }
            while(i<n && nums[i] == curr){
                i++;
            }
            strak++;
            curr++;
            res = Math.max(res , strak);
        }
        return res;
    }
}
