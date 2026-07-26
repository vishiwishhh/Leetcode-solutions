class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int k = n-1;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            if(Math.abs(nums[left])> Math.abs(nums[right])){ //Math.abs is only used while comparing 
                ans [k] = nums[left] * nums[left];
                left++;
                k--;
            }
            else{
                ans [k] = (nums[right]) * (nums[right]);
                right--;
                k--;
            }
        }
    return ans;
    }
}