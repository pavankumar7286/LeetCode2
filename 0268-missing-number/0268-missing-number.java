class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;

        for(int i =0;i<n;i++){
            actualSum += nums[i];
        }
        int ans = sum - actualSum;

        return ans;
    }
}