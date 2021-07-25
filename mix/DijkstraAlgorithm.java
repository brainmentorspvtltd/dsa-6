package com.dit.dsa.mix;

public class DijkstraAlgorithm {
	
	public static void dijkstraAlgo(int adjMat[][], int distance[], int srcV)
	{
		int v = adjMat.length;
		boolean visited[] = new boolean[v];
		
		for(int i = 0; i < v; i++)
		{			
			distance[i] = Integer.MAX_VALUE;
		}
		
		distance[0] = 0;
		
		for(int i = 0; i < v; i++)
		{
			int minV = findMinV(distance, visited);
			visited[minV] = true;
			
			for(int j = 0; j < v; j++)
			{
				if(adjMat[minV][j] != 0 && visited[j] == false && distance[minV] != Integer.MAX_VALUE)
				{
					int newDist = distance[minV] + adjMat[minV][j];
					
					if(distance[j] > newDist)
					{
						distance[j] = newDist;
					}
				}
			}
			
		}
	}
	
	public static int findMinV(int distance[], boolean visited[])
	{
		int minV = -1;
		
		for(int i = 0; i < distance.length; i++)
		{
			if(visited[i] == false && (minV == -1 || distance[i] < distance[minV]))
			{
				minV = i;
			}
		}
		
		return minV;
	}
	
	public static void main(String[] args) {
		
		int v = 6;
		int e = 7;
		
		int adjMat[][] = {
						 {0, 2, 0, 4, 0, 0},
						 {0, 0, 3, 1, 0, 0},
						 {0, 0, 0, 0, 0, 4},
						 {0, 0, 0, 0, 2, 0},
						 {0, 0, 0, 0, 0, 1},
						 {0, 0, 0, 0, 0, 0}};
		
		int srcV = 0;
		int distance[] = new int[v];
		
		dijkstraAlgo(adjMat, distance, srcV);
		
		for(int i = 0; i < v; i++)
		{
			System.out.print(distance[i]+" ");
		}
		
	}

}
