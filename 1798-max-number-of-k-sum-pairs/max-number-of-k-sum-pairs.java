import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int count = 0;
        

        while(left<right){
        int sum = nums[left]+nums[right];
        
            if(sum>k){  //move left
                right--;

            }
            else if (sum<k){   //move right
                left++;
            }
            else if(sum==k){
                count++;
                left++;
                right--;
            }
            }
        return count;
            }
        
        }


        
    
