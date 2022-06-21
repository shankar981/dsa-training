class Minimum {
    int result=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        
        int depth=1;
        if(root==null)
            return 0;
        return height(root,depth);
        
    }
    public int height(TreeNode node, int depth)
    {
        if(node==null)
         return 0;
        if(node.left==null && node.right==null)
            result=Math.min(result,depth);
        height(node.left,depth+1);
        height(node.right,depth+1);
        return result;
    }
    
}
