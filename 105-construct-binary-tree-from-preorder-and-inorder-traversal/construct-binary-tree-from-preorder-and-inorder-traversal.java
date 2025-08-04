class Solution {
    private int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return constructTree(preorder, inMap, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, Map<Integer, Integer> inMap, int left, int right) {
        if (left > right) return null;

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int index = inMap.get(rootVal);

        root.left = constructTree(preorder, inMap, left, index - 1);
        root.right = constructTree(preorder, inMap, index + 1, right);

        return root;
    }
}