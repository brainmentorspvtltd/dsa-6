package com.dit.dsa.mix;

class SNode {
	int data;
	SNode left, right;
	
	SNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class InorderSuccessorBST {
	
	public static SNode insert(SNode root, int data) // insertion in BST
	{
		if(root == null)
		{
			return new SNode(data);
		}
		
		//left subtree
		if(data < root.data)
		{
			root.left = insert(root.left, data);
		}
		else {//right subtree
			root.right = insert(root.right, data);
		}
		
		return root;
	}
	
	public static SNode findmin(SNode root)
	{
		while(root.left != null)
		{
			root = root.left;
		}
		
		return root;
	}
	
	public static SNode findSuccessor(SNode root, int target)
	{
		SNode successor = null;
		
		while(true)
		{
			//if target doesn't exist
			if(root == null)
			{
				return null;
			}
			
			if(target < root.data)
			{
				successor = root;
				root = root.left;
			}
			
			else if(target > root.data)
			{
				root = root.right;
			}
			
			else {
				if(root.right != null)
				{
					successor = findmin(root.right);
				}
				
				break;
			}
		}
		
		return successor;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SNode root = null; 
		
		root = insert(root, 5);
		root = insert(root, 3);
		root = insert(root, 17);
		root = insert(root, 10);
		root = insert(root, 84);
		
		//int target = 10;
		//int target = 3;
		//int target = 17;
		//int target = 84;
		int target = 5;
		
		SNode successor = findSuccessor(root, target);
		
		if(successor != null)
		{
			System.out.println("The successor of node "+target+" is "+successor.data);
		}
		else {
			System.out.println("The successor doesn't exist");
		}

	}

}
