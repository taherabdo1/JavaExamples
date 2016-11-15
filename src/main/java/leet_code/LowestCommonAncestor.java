package leet_code;


/**
 * 
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 *Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.


 */
/**
 * Definition for a binary tree node.
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     TreeNode smallerNode = p.val > q.val? q:p;
     TreeNode biggerNode = p.val <= q.val? q:p;
     
     return getLCA(root, smallerNode, biggerNode);
    }
    
    
    private TreeNode getLCA(TreeNode root, TreeNode p , TreeNode q){
    	if(isChild(root.left, p) && isChild(root.right, q)){
   		 return root;
   	 }else if(root.val == p.val && isChild(root.right, q)){
   		 return root;
   	 }else if(root.val == q.val && isChild(root.left, p)){
   		return root;
   	 }else if(root.val > p.val){
   		 root = root.left;
   		 return getLCA(root, p, q);
   	 }else if(root.val < p.val){
   		 root = root.right;
   		 return getLCA(root, p, q);
   	 }else{
   		 return null;
   	 }
    }
    
    
    private static boolean isChild (TreeNode root , TreeNode currentNode){
    	boolean result= false;
    	TreeNode looper = root;
    	while(looper != null){
    		if(looper.val == currentNode.val){
    			return true;
    		}
    		if(looper.val > currentNode.val){
        		looper = looper.left;    			
    		}else{
    			looper = looper.right;
    		}
    	}
    	
    	return result;
    }
    
    
    public static void main(String[] args){
    	LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
    	
    	TreeNode rooNode = new TreeNode(6);
    	rooNode.left = new TreeNode(2);
    	rooNode.right= new TreeNode(8);
       	rooNode.left.left = new TreeNode(0);   	
       	rooNode.left.right = new TreeNode(4);   
       	rooNode.left.right.left = new TreeNode(3); 
       	rooNode.left.right.right= new TreeNode(5);
       	rooNode.right.left= new TreeNode(7);
       	rooNode.right.right= new TreeNode(9);

       	System.out.println(lowestCommonAncestor.lowestCommonAncestor(rooNode , new TreeNode(2) , new TreeNode(4)).val);
//       	lowestCommonAncestor.lowestCommonAncestor(rooNode , new TreeNode(2) , new TreeNode(8));
       	}
}
