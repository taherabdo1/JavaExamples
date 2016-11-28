package interviewPracticing;

import java.util.ArrayList;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


//print binary tree nodes line by line (BF)
public class PrintBinaryTreeLineByLine {

	int lineNumber = 0;
	Queue<TreeNode> nodesTree;
	public PrintBinaryTreeLineByLine(){
		nodesTree = (Queue<TreeNode>) new LinkedList<TreeNode>();
	}
	public void solution(TreeNode root){
		if(root != null){
			System.out.print(root.val);
			nodesTree.add(root.left);
			nodesTree.add(root.left);
		}
		
	}
	
}
