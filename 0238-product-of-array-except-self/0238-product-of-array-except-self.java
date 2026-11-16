
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int k = 1;

        int[] right = new int[n];

        for(int i = n-1; i >= 0; i--) {
            k = k * nums[i];
            right[i] = k;
        }

        int left = 1;
        int[] ans = new int[n];

        for(int i = 0; i < n-1; i++) {
            int val = right[i+1] * left;
            ans[i] = val;
            left = left * nums[i];
        }

        ans[n-1] = left;

        return ans;
    }
}

