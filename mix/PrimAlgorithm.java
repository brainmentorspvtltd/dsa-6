package com.dit.dsa.mix;

public class PrimAlgorithm {
	
	public static void primAlgo(int adjMat[][])
	{
		int V = adjMat.length;
		int parent[] = new int[V];
		int weight[] = new int[V];
		boolean visited[] = new boolean[V];
		
		for(int i = 0; i < V; i++)
		{
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
			parent[i] = -1;
		}
		
		weight[0] = 0;
		
		for(int i = 0; i < V; i++)
		{
			int w = minWeight(weight, visited);
			visited[w] = true;
			
			for(int v = 0; v < V; v++)
			{
				if(adjMat[w][v] != 0 && visited[v] == false && adjMat[w][v] < weight[v])
				{
					parent[v] = w;
					weight[v] =  adjMat[w][v];
				}
			}
		}
		
		printPrimAlgo(parent, adjMat);
	}
	
	public static int minWeight(int weight[], boolean visited[])
	{
		int V = weight.length;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0; i < V; i++)
		{
			if(visited[i] == false && weight[i] < min)
			{
				min = weight[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static void printPrimAlgo(int parent[], int adjMat[][])
	{
		int V = adjMat.length;
		
		for(int i = 1; i < V; i++)
		{
			System.out.println(parent[i] + " - " + i + " --> " +adjMat[i][parent[i]]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = 6;
		int e = 7;
		
		int adjMat[][] = {
						 {0, 2, 0, 4, 0, 0},
						 {2, 0, 3, 1, 0, 0},
						 {0, 3, 0, 0, 0, 4},
						 {4, 1, 0, 0, 2, 0},
						 {0, 0, 0, 2, 0, 1},
						 {0, 0, 0, 4, 1, 0}};
		
		primAlgo(adjMat);

	}

}
