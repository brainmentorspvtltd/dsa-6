public class SearchSortedArray {
	
    private static int search(int[] arr, int target) {
        
    	int left = 0;
        int right = arr.length-1;
        
        while(left <= right) {
            
        	int mid = (left+right)/2;
            
            if(target == arr[mid]) {
                return mid;
            }
            
            if(arr[left] <= arr[mid]) { 
                
            	if(target >= arr[left] && target < arr[mid]) {
                    right = mid-1;
                } 
            	else {
                    left = mid+1;
                }
            } 
            else { 
                
            	if(target > arr[mid] && target <= arr[right]) {
                    left = mid+1;
                } 
            	else {
                    right = mid-1;
                }
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
    	
        int arr[] = {1};
        int target = 0;
        
        System.out.println(search(arr, target));
    }
}