class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference
        String reference = strs[0];

        // Traverse each character of the reference string
        for (int i = 0; i < reference.length(); i++) {

            // Compare with every other string
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i >= strs[j].length() ||
                    strs[j].charAt(i) != reference.charAt(i)) {

                    return reference.substring(0, i);
                }
            }
        }

        // Entire reference string is the common prefix
        return reference;
    }
}