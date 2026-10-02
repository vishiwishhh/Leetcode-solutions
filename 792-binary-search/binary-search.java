class Solution {

    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    public int binarySearch(int[] arr, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, right);
    }
}


//recursion code