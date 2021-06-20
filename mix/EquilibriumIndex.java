public class EquilibriumIndex {

static int checkEquilibrium(int arr[], int N)
{
	 int[] left = new int[N];
	 int[] right = new int[N];
	
    if (N == 1)
        return (0);
 
    //left to end
    for (int i = 0; i < N; i++)
    {
        if (i != 0)
        {
            left[i] = left[i - 1] + arr[i];
        }
        else
        {
            left[i] = arr[i];
        }
    }
   
    //right to start
    for (int i = N - 1; i > 0; i--)
    {
        if (i <= N - 2)
        {
            right[i] = right[i + 1] + arr[i];
        }
        else
        {
            right[i] = arr[i];
        }
    }
    
    for(int i = 0; i < N; i++)
    {
        if (left[i] == right[i])
        {
            return i;
        }
    }
     
    return -1;
}
 
public static void main(String[] args)
{
    int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
     
    System.out.println("Equilibrium Index is " +checkEquilibrium(arr, arr.length));
}
}