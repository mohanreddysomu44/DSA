class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                result.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                result.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        // Handle remaining entries
        while (i < nums1.length) {
            result.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }

        while (j < nums2.length) {
            result.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        // Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][2]);
    }
}