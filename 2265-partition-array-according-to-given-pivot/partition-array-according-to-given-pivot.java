class Solution {
    public static int[] rearrange(int[] arr, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : arr) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        // Merge all lists into a single array
        int[] result = new int[arr.length];
        int idx = 0;
        for (int num : less) result[idx++] = num;
        for (int num : equal) result[idx++] = num;
        for (int num : greater) result[idx++] = num;

        return result;
    }

    public int[] pivotArray(int[] nums, int pivot) {
        return rearrange(nums, pivot);
    }
}