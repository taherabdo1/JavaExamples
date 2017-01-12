package amadeus;

public class taskOne {

	public static void main(String[] args){
//		fizzBuzz(15);
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(25);
		root.right.right = new Node(40);
		System.out.println(isPresent(root, 30));
		}

static void fizzBuzz(int n) {

	StringBuffer buffer = new StringBuffer();
	for(int i = 1 ; i <= n ; i++){
		if(i%3 == 0)
			buffer.append("Fizz");
		if(i%5 == 0)
			buffer.append("Buzz");
		if(buffer.length() == 0)
			buffer.append(i);
		System.out.println(buffer.toString());
		buffer = new StringBuffer();
	}

}


static class Node {
		Node left, right;
		int data;
                Node(int newData) {
			left = right = null;
			data = newData;
		}
	}
 

static boolean found = false; 
private static int isPresent(Node root, int val){

	if(root != null && !found){
		if(root.data == val){
			found = true;
		}
		else if(root.data > val && found == false){
			isPresent(root.left, val);
		}else if(root.data < val && found == false){
			isPresent(root.right, val);
		}
	}
	if(!found)
		return 0;
	else
		return 1;
}
}