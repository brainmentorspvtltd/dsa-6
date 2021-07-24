package com.dit.dsa.mix;

import java.util.Arrays;

class Edge implements Comparable<Edge>{
	int src = 0;
	int dest = 0;
	int weight = 0;
	
	Edge(int src, int dest, int weight)
	{
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}
	
	public int compareTo(Edge comparable)
	{
		return this.weight - comparable.weight;
	}
}

public class KruskalAlgorithm {
	
	public static void kruskalAlgo(Edge input[], int v, int e)
	{
		//sorting
		Arrays.sort(input);
		
		Edge output[] = new Edge[v - 1];
		int parent[] = new int[v];
		int k = 0;
		
		for(int i = 0; i < v; i++)
		{
			parent[i] = i;
		}
		
		for(int i = 0; i < e; i++)
		{
			Edge currentEdge = input[i];
			
			int srcParent = findParent(currentEdge.src, parent);
			int destParent = findParent(currentEdge.dest, parent);
			
			if(srcParent != destParent)
			{
				output[k] = currentEdge;
				k++;
				parent[srcParent] = destParent;
			}
		}
		
		for(int i = 0; i < output.length; i++)
		{
			System.out.println(output[i].src+" --> "+output[i].dest+" --> "+output[i].weight);
		}
	}
	
	public static int findParent(int v, int parent[])
	{
		if(parent[v] == v)
		{
			return v;
		}
		
		return findParent(parent[v], parent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int v = 4;
		int e = 5;
		
		Edge input[] = new Edge[e];
		
		input[0] = new Edge(2, 3, 4);
		input[1] = new Edge(0, 3, 5);
		input[2] = new Edge(0, 2, 6);
		input[3] = new Edge(0, 1, 10);
		input[4] = new Edge(1, 3, 15);
		
		kruskalAlgo(input, v, e);

	}

}
