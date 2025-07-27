class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return build(0, pre.length - 1, 0, post.length - 1, pre, post);
    }

    public TreeNode build(int i1, int i2, int j1, int j2, int[] pre, int[] post) {
        if (i1 > i2) return null;

        TreeNode root = new TreeNode(pre[i1]);
        if (i1 == i2) return root;

        int leftVal = pre[i1 + 1];
        int index = j1;

        while (post[index] != leftVal) {
            index++;
        }

        int size = index - j1 + 1;

        root.left = build(i1 + 1, i1 + size, j1, index, pre, post);
        root.right = build(i1 + size + 1, i2, index + 1, j2 - 1, pre, post);

        return root;
    }
}