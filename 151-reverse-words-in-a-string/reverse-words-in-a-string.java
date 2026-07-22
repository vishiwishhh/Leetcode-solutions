class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        int right = s.length() - 1;

        while (right >= 0) {

            // Skip spaces
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }

            if (right < 0) {
                break;
            }

            // Mark the end of the current word
            int end = right;

            // Move left until the space before the word
            while (right >= 0 && s.charAt(right) != ' ') {
                right--;
            }

            int start = right + 1;

            // Add a space before the next word (not before the first)
            if (sb.length() > 0) {
                sb.append(' ');
            }

            // Copy the current word character by character
            for (int i = start; i <= end; i++) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}