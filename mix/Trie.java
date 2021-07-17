package com.dit.dsa.mix;

public class Trie {
	
	static final int ALPHABET_SIZE = 26;
	
	static class TrieNode {
		
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord;
		
		TrieNode()
		{
			isEndOfWord = false;
			for(int i = 0; i < ALPHABET_SIZE; i++)
			{
				children[i] = null;
			}
		}
	}
	
	static TrieNode root;
	
	static void insert(String key)
	{
		TrieNode temp = root;
		
		for(int level = 0; level < key.length(); level++)
		{
			int index = key.charAt(level) - 'a';
			
			// if input key is new
			if(temp.children[index] == null)
			{
				temp.children[index] = new TrieNode();
			}
			
			temp = temp.children[index];
		}
		
		temp.isEndOfWord = true; // last node as leaf
	}
	
	static boolean search(String key)
	{
		TrieNode temp = root;
		
		for(int level = 0; level < key.length(); level++)
		{
			int index = key.charAt(level) - 'a';
			
			if(temp.children[index] == null)
			{
				return false;
			}
			
			temp = temp.children[index];
		}
		
		return (temp.isEndOfWord);
	}
	
	static TrieNode delete(TrieNode root, String key, int depth)
	{
		/*  If tree is empty
		if(root == null)
		{
			return null;
		}
		*/
		
		if(depth == key.length())
		{
			root.isEndOfWord = false;
			
			return root;
		}
		
		int index = key.charAt(depth) - 'a';
		root.children[index] = delete(root.children[index], key, depth+1);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root = new TrieNode();
		
		insert("the");
		insert("there");
		insert("their");
		insert("bye");
		
		if(search("their") == true)
		{
			System.out.println("Present in Trie");
		}
		else {
			System.out.println("Not Present in Trie");
		}
		
		delete(root, "their", 0);
		
		if(search("their") == true)
		{
			System.out.println("Present in Trie");
		}
		else {
			System.out.println("Not Present in Trie");
		}

		if(search("thei") == true)
		{
			System.out.println("Present in Trie");
		}
		else {
			System.out.println("Not Present in Trie");
		}

		insert("thei");
		
		if(search("thei") == true)
		{
			System.out.println("Present in Trie");
		}
		else {
			System.out.println("Not Present in Trie");
		}
	}

}
