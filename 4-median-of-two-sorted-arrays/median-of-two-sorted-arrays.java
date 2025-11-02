class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
        int i1 = 0, i2 = 0, start = 0;

        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] <= nums2[i2]) {
                merged[start++] = nums1[i1++];
            } else {
                merged[start++] = nums2[i2++];
            }
        }

        while (i1 < nums1.length) {
            merged[start++] = nums1[i1++];
        }

        while (i2 < nums2.length) {
            merged[start++] = nums2[i2++];
        }

        int mid = merged.length / 2;
        if (merged.length % 2 != 0) {
            return merged[mid];
        } else {
            return (merged[mid] + merged[mid - 1]) / 2.0;
        }
    }
}