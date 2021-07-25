package com.dit.dsa.mix;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopoSorting {
	
	int V;
	LinkedList<Integer> adj[]; // adjacent list
	
	TopoSorting(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int u, int v)
	{
		adj[u].add(v);
	}
	
	void topologicalSort()
	{
		Stack stack = new Stack();
		
		boolean visited[] = new boolean[V];
		
		for(int i = 0; i < V; i++)
		{
			visited[i] = false;
		}
		
		for(int i = 0; i < V; i++)
		{
			if(visited[i] == false)
			{
				topoSortUtil(i, visited, stack);
			}
		}
		
		//Topological Sort
		while(stack.empty() == false)
		{
			System.out.print(stack.pop()+" ");
		}
	}
	
	@SuppressWarnings("deprecation")
	void topoSortUtil(int v, boolean visited[], Stack stack)
	{
		visited[v] = true;
		Integer i;
		
		Iterator<Integer> ptr = adj[v].iterator();
		
		while(ptr.hasNext())
		{
			i = ptr.next();
			
			if(!visited[i])
			{
				topoSortUtil(i, visited, stack);
			}
		}
		
		stack.push(new Integer(v));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TopoSorting graph = new TopoSorting(6);
		
		graph.addEdge(5, 2);
		graph.addEdge(5, 0);
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		
		System.out.println("Topological Sorting is");
		graph.topologicalSort();

	}

}
