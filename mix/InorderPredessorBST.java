package com.dit.dsa.mix;

class PNode {
	int data;
	PNode left, right;
	
	PNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class InorderPredessorBST {
	
	public static PNode insert(PNode root, int data) // insertion in BST
	{
		if(root == null)
		{
			return new PNode(data);
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
	
	public static PNode findmax(PNode root)
	{
		while(root.right != null)
		{
			root = root.right;
		}
		
		return root;
	}
	
	public static PNode findPredessor(PNode root, int target)
	{
		PNode predessor = null;
		
		while(true)
		{
			if(root == null)
			{
				return null;
			}
			
			if(target < root.data)
			{
				root = root.left;
			}
			else if(target > root.data)
			{
				predessor = root;
				root = root.right;
			}
			else {
				if(root.left != null)
				{
					predessor = findmax(root.left);
				}
				
				break;
			}
		}
		
		return predessor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PNode root = null; 
		
		root = insert(root, 5);
		root = insert(root, 3);
		root = insert(root, 17);
		root = insert(root, 10);
		root = insert(root, 84);
		
		//int target = 10;
		//int target = 3;
		//int target = 17;
		int target = 84;
		//int target = 5;
		
		PNode predessor = findPredessor(root, target);
		
		if(predessor != null)
		{
			System.out.println("The Predessor of node "+target+" is "+predessor.data);
		}
		else {
			System.out.println("The Predessor doesn't exist");
		}

	}

}
