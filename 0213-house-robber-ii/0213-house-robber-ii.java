class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1) return nums[0];

        int skipFirst[] = new int[n-1];
        int skipLast[] = new int[n-1];

        for(int x=0;x<n-1;x++){
            skipLast[x] = nums[x];
            skipFirst[x] = nums[x+1];
        }

        int lootSkippingLast = helper(skipLast);
        int lootSkippingFirst = helper(skipFirst);

        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    public int helper(int nums[]){
        int n = nums.length;

        if(n<=1) return nums[0];

        int dp[] = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int x=2;x<n;x++){

            dp[x] = Math.max(nums[x] + dp[x-2], dp[x-1]);
        }

        return dp[n-1];
    }
}