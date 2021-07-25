package com.dit.dsa.mix;

public class TSP {
	
	public static int tsp(int graph[][], boolean visited[], int currentPos, int n, int count, int cost, int result)
	{
		if(count == n && graph[currentPos][0] > 0)
		{
			result = Math.min(result,  cost + graph[currentPos][0]);
			return result;
		}
		
		
		for(int i = 0; i < n; i++)
		{
			if(visited[i] == false && graph[currentPos][i] > 0)
			{
				visited[i] = true;
				result = tsp(graph, visited, i, n, count + 1, cost + graph[currentPos][i], result);
				
				visited[i] = false;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		int graph[][] = {
						{0, 10, 15, 20},
						{10, 0, 35, 25},
						{15, 35, 0, 30},
						{20, 25, 30, 0}};
		
		boolean visited[] = new boolean[n];
		
		visited[0] = true;
		int result = Integer.MAX_VALUE;
		
		result = tsp(graph, visited, 0, n, 1, 0, result);
		
		System.out.println(result);		

	}

}
