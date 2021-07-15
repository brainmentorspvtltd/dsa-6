package tree;

import java.util.Scanner;

class BinarySearchTree<T>{
	T data;
	BinarySearchTree<T> left;
	BinarySearchTree<T> right;
	BinarySearchTree(T data){
		this.data = data;
	}
	
}
class BSTOperations{
	BinarySearchTree<Integer> root;
//	String message = "root";
//	BinaryTree<Integer> insert(){
//		System.out.println("Enter the Data of "+message +" or enter -1 to exit");
//		var data = scanner.nextInt();
//		if(data == -1) {
//			return null;
//		}
//		BinaryTree<Integer> node = new BinaryTree<>(data); // A Tree Node is Created
//		if(data<node.data) {
//		message = "left";
//		node.left = insert();
//		}
//		else
//		if(data>node.data) {	
//		message = "right";
//		node.right = insert();
//		}
//		return node;
//	}
	
	BinarySearchTree<Integer> insert(BinarySearchTree<Integer> node, int data) {
		if(node == null) {
			node = new BinarySearchTree<Integer>(data);
			
		}
		else
		if(data<node.data) {
			
			node.left = insert(node.left, data);
		}
		else
		if(data>node.data) {
			
			node.right = insert(node.right, data);
		}
		return node;
		
	}
	Scanner scanner = new Scanner(System.in);
	int data ;
	void input() {
		
		do {
			System.out.println("Enter the Data ");
			data = scanner.nextInt();
			if(data==-1) {
				break;
			}
			root =insert(root, data);
		}while(data!=-1);
	}
	
void inputArray() {
		
		int arr[] = {10,20,25,18,7,5,4};
		for(int data: arr) {
			root =insert(root, data);
		}
		
		print(root);
		
	}

	void delete() {
		
		// Search the Node and maintain the isLeft Flag and also maintain the parent (Predecssor)
		
		// Case - 1 When Left and right child are null
		
		// Case -2 When left child is null and right child is not null
		
		// Case -3 When right child is null and left child is not null
		
		// Case -4 When left child is not null and right child is not null
		
		
	}
	
	void print(BinarySearchTree<Integer> node) {
		if(node!=null) {
			print(node.left);
			System.out.println(node.data);
			print(node.right);
			
		}
	}
	
}
public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		BSTOperations opr = new BSTOperations();
		Scanner scanner =new Scanner(System.in);
		while(true) {
			System.out.println("1. Insert");
			System.out.println("2. Print");
			System.out.println("Enter the Choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				opr.input();
				break;
			case 2:
				
				opr.print(opr.root);
				break;
			}
			
		}

	}

}
