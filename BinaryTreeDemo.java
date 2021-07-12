package tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T>{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	BinaryTree(T data){
		this.data = data;
		//this.left = this.right = null; by default null
	}
}

class BinaryTreeOperations{
	Scanner scanner = new Scanner(System.in);
	String message = "root";
	BinaryTree<Integer> insert(){
		System.out.println("Enter the Data of "+message +" or enter -1 to exit");
		var data = scanner.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTree<Integer> node = new BinaryTree<>(data); // A Tree Node is Created
		message = "left";
		node.left = insert(); 
		message = "right";
		node.right = insert();
		return node;
	}
	void print(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" => ");
		if(root.left!=null) {
			System.out.print(root.left.data+" , ");
			
		}
		if(root.right!=null) {
			System.out.print(root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	void inorder(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	
	void inorderItr(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		// Create a stack 
		Stack<BinaryTree> stack = new Stack<>();
		// push the root in stack 
		
		BinaryTree<Integer> currentNode = root;
		while(currentNode!=null || !stack.isEmpty()) {
			while(currentNode!=null) {
				//System.out.println(currentNode.data);
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.println(currentNode.data);
			currentNode  = currentNode.right;
		}
	}
	
	void levelOrder(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTree<Integer> currentNode = queue.removeFirst();
			System.out.println(currentNode.data+" , ");
			if(currentNode.left!=null) {
				//queue.add(currentNode)
				queue.addLast(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.addLast(currentNode.right);
			}
		}
	}
	
	void levelOrderPrintBetter(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			for(int i =0 ; i<size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
			System.out.print(currentNode.data+" , ");
			if(currentNode.left!=null) {
				//queue.add(currentNode)
				queue.addLast(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.addLast(currentNode.right);
			}
			}
			System.out.println();
		}
	}
	
	void preorder(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		preorder(root.left);
		
		preorder(root.right);
		
	}
	
	// Iterative Solution
	void preorderItr(BinaryTree<Integer> root) {
		// Create a stack 
		Stack<BinaryTree> stack = new Stack<>();
		// push the root in stack 
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.pop();
			System.out.println(currentNode.data);
			if(currentNode.right!=null) {
				stack.push(currentNode.right);
			}
			if(currentNode.left!=null) {
				stack.push(currentNode.left);
			}
		}
		
	}
	
	void preorderItr2(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		// Create a stack 
		Stack<BinaryTree> stack = new Stack<>();
		// push the root in stack 
		
		BinaryTree<Integer> currentNode = root;
		while(currentNode!=null || !stack.isEmpty()) {
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				if(currentNode.right!=null) {
					stack.push(currentNode.right);
				}
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
		}
		
		
	}

	void postorder(BinaryTree<Integer> root) {
		if(root == null) {
			return ;
		}
		
		postorder(root.left);
		
		postorder(root.right);
		System.out.println(root.data);
		
	}
	void postorderItr(BinaryTree<Integer> root) {
		
	}
	
}


public class BinaryTreeDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BinaryTreeOperations opr = new BinaryTreeOperations();
		BinaryTree<Integer> root  = null;
		while(true) {
			System.out.println("1. Insertion in BT ");
			System.out.println("2. Print ");
			System.out.println("Enter the Choice ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				root = opr. insert();
				break;
			case 2:
				opr.levelOrderPrintBetter(root);
				//opr.levelOrder(root);
				//opr.print(root);
				break;
			default:
				break;
			}
		}

	}

}
