class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;

        while (mid<=right){
            if(nums[mid]==0){   //swap 0 with int left
            int temp = nums[mid];
            nums[mid] = nums[left];
            nums[left] = temp;

            left++;
            mid++;
            }

        else if (nums[mid]==2){  //swap with right
            int temp = nums[mid];
            nums[mid]=nums[right];
            nums[right]=temp;

        right--;
        }
        else{
            mid++;
        }
        }
    }
}