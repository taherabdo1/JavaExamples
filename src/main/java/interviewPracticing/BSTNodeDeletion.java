package interviewPracticing;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
 * URL: https://leetcode.com/problems/delete-node-in-a-bst/
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

 Basically, the deletion can be divided into two stages:

 Search for a node to remove.
 If the node is found, delete the node.
 Note: Time complexity should be O(height of tree).
 */
public class BSTNodeDeletion {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int x) {
			val = x;
		}
		
	}

	public static TreeNode deleteNode(TreeNode root, int key) {

		if(root == null || (root.left == null && root.right == null)){
			if(root.val == key)
				root = null;
			return root;
			
		}
		TreeNode tracker = root;
		TreeNode parent = null;
		while (tracker != null) {
			// found the key
			if (tracker.val == key) {
				// delete note
				TreeNode left = tracker.left;
				TreeNode right = tracker.right;
				
				if(parent != null){
					if(parent.left == tracker) 
						parent.left = null;
					else parent.right = null;
										
				}
				if(left != null)
					insert(root, left);
				if(right != null)
					insert(root, right);
		
				break;
			} else if (key > tracker.val) {
				parent = tracker;
				tracker = tracker.right;
			} else if (key < tracker.val) {
				parent = tracker;
				tracker = tracker.left;
			}
		}
		// get the node using BST

		return root;

	}

	static void insert(TreeNode root, TreeNode node) {

		while(root != null){
			if(root.val >= node.val && root.left == null){
				root.left = node;
				break;
			}else if(root.val < node.val && root.right == null){
				root.right = node;
				break;
			}
			else if(node.val >= root.val && root.right != null){
				root = root.right;
			}else if(node.val <= root.val && root.left != null){
				root = root.left;
			}
		}
	}

	public static void main(String [] args){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right= new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(7);
		
		TreeNode root2 = new TreeNode(1);
		root2.right= new TreeNode(2);
		
		
		
//		root = deleteNode(root , 3);
		root2 = deleteNode(root2, 1);
		
	}
}
