import java.util.Arrays;

class Solution {

    public void swap(int l, int r, int[] arr) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(left, right, arr);
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, n - 1);
        } else {
            for (int i = n - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    swap(i, pivot, arr);
                    break;
                }
            }
            reverse(arr, pivot + 1, n - 1);
        }
    }
}