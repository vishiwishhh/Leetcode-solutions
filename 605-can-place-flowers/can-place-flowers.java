class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // Edge case: only one plot
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 ? n <= 1 : n == 0;
        }

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            // First position
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }

            // Last position
            else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }

            // Middle positions
            else {
                if (flowerbed[i] == 0 &&
                    flowerbed[i - 1] == 0 &&
                    flowerbed[i + 1] == 0) {

                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}