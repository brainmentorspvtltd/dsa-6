package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

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
	
	
//	BinaryTree<Integer> insert(int data){
////		System.out.println("Enter the Data of "+message +" or enter -1 to exit");
////		var data = scanner.nextInt();
////		if(data == -1) {
////			return null;
////		}
//		BinaryTree<Integer> node = new BinaryTree<>(data); // A Tree Node is Created
//		message = "left";
//		node.left = insert(); 
//		message = "right";
//		node.right = insert();
//		return node;
//	}
	void buildTree() {
		BinaryTree<Integer> node = new BinaryTree<>(10);
		BinaryTree<Integer> leftNode = new BinaryTree<>(20);
		BinaryTree<Integer> rightNode = new BinaryTree<>(30);
		node.left = leftNode;
		node.right =rightNode;
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
	
	
	void maxWidthOfTree(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		int max = 0;
		queue.add(root);
		while(!queue.isEmpty()) {
			//BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			max = Math.max(max, size);
			for(int i =0 ; i<size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
			//System.out.print(currentNode.data+" , ");
			if(currentNode.left!=null) {
				//queue.add(currentNode)
				queue.addLast(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.addLast(currentNode.right);
			}
			}
			//System.out.println();
		}
		System.out.println("Max Width is "+max);
	}
	
	
	void leftView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			for(int i =0 ; i<size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				if(i==0) {
				System.out.print(currentNode.data+" , ");
				}
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
	
	void rightView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//BinaryTree<Integer> currentNode = queue.removeFirst();
			int size = queue.size();
			//System.out.println(queue.getFirst().data);
			for(int i =0; i<size; i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				if(i==0) {
					System.out.print(currentNode.data+" , ");
					}
				if(currentNode.right!=null) {
					queue.addLast(currentNode.right);
				}
			if(currentNode.left!=null) {
				//queue.add(currentNode)
				queue.addLast(currentNode.left);
			}
			
			}
			//System.out.println();
		}
	}
	
	/*
	 * distance default value is 0 , because start from root (0)
	 * 
	 */
	void verticalOrder(BinaryTree<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
		if(root == null) {
			return ;
		}
		if(map.get(distance)==null) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(root.data);
			map.put(distance, list);
		}
		else {
			ArrayList<Integer> list = map.get(distance);
			list.add(root.data);
			map.put(distance, list);
		}
		verticalOrder(root.left, distance-1, map);
		verticalOrder(root.right, distance+1, map);
	}
	
	void topView(BinaryTree<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		verticalOrder(root, 0, map);
		for(Map.Entry<Integer, ArrayList<Integer>> m :   map.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue().get(0));
		}
	}
	
	void bottomView(BinaryTree<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		verticalOrder(root, 0, map);
		for(Map.Entry<Integer, ArrayList<Integer>> m :   map.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue().get(m.getValue().size()-1));
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
	
	
	private void printLeaf(BinaryTree<Integer> root) {
		
		if(root == null) {
			return ;
		}
		printLeaf(root.left);
		if(root.left == null && root.right== null) {
			System.out.print(root.data + ", ");
		}
		printLeaf(root.right);
	}
	
	private void printLeftBoundary(BinaryTree<Integer> root) {
		if(root ==  null) {
			return ;
		}
		if(root.left!=null) {
			System.out.print(root.data);
			printLeftBoundary(root.left);
		}
		else if(root.right!=null){
			System.out.print(root.data);
			printLeftBoundary(root.right);
		}
	}
	
	private void printRightBoundary(BinaryTree<Integer> root) {
		if(root ==  null) {
			return ;
		}
		if(root.right!=null) {
			printLeftBoundary(root.right);
			System.out.print(root.data);
			
		}
		else 
			if(root.left!=null)
		{
			printLeftBoundary(root.left);
			System.out.print(root.data);
			
		}
	}
	
	void printBoundary(BinaryTree<Integer> root) {
		if(root== null) {
			return ;
		}
		System.out.println(root.data);
			printLeftBoundary(root.left);
			System.out.println();
			printLeaf(root);
			System.out.println();
			printRightBoundary(root.right);
			
	}
	
	void diagonalView(BinaryTree<Integer> root) {
		LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size-->0) {
				BinaryTree<Integer> current = queue.removeFirst();
				while(current!=null) {
					System.out.print(current.data+" , ");
					if(current.left!=null) {
						queue.addLast(current.left);
					}
					current =current.right;
					
				}
				System.out.println();
			}
		}
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
	
	
	int height(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	void printKthDistance(BinaryTree<Integer> root, int kth) {
		if(root == null) {
			return ;
		}
		if(kth==0) {
			System.out.println(root.data);
		}
		printKthDistance(root.left, kth-1);
		printKthDistance(root.right, kth-1);
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
				//opr.levelOrderPrintBetter(root);
				//opr.leftView(root);
				//opr.rightView(root);
				//TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
				//opr.verticalOrder(root, 0, map);
				//System.out.println(map);
				//opr.topView(root);
				//opr.diagonalView(root);
				opr.printBoundary(root);
				//opr.levelOrder(root);
				//opr.print(root);
				break;
			default:
				break;
			}
		}

	}

}
