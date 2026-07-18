class Solution {
    public boolean isPalindrome(String s) {
     
     int left= 0;
     int right = s.length()-1;
     while(left<right){

        //skip non alphanumeric character from left ignore

        if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
            continue;
        }
        //skip non alphanumeric character from right ignore 
        if (!Character.isLetterOrDigit(s.charAt(right))){
            right--;
            continue;
        }

        //comparison
        if (Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
            return false;
        }

    left++;
    right--;

    }
     return true;
    }
}