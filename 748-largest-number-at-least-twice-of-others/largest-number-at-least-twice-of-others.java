class Solution {
    public int dominantIndex(int[] nums) {

        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i =0; i<nums.length; i++){
            if(nums[i]>max){
            SecondMax = max;
            max = nums[i];
            maxIndex = i;

           }
           else if (nums[i]>SecondMax){
            SecondMax = nums[i];
           }

       
        }
     if(max >= 2*SecondMax){
            return maxIndex;
        

     } 
    return -1;
    }
}