class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] freq = new int[26];


        //count the character in s string
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
                freq[ch -'a']++;
            }

        // subtract the character counts in second string
        for(int i =0 ; i<t.length(); i++){
            char ch = t.charAt(i);
            freq[ch - 'a']--;

        }
        
        //check if counts are zero
        for(int count: freq){
            if(count!=0){
            return false;
            }

        }

    return true;
    }
}