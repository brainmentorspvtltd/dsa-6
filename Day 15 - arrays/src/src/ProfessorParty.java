import java.util.HashMap;

public class ProfessorParty {

	public static void main(String[] args) {
		long arr[] = {1,2,3,4,5,1,6};
		long j = 0;
		long bb = arr[(int)j];
		//long m = Math.abs(arr[j]);
		for(int i = 0; i<arr.length; i++) {
			if(arr[Math.abs((int)arr[i])]>=0) {
				arr[Math.abs((int)arr[i])] = - arr[Math.abs((int)arr[i])];
			}
			else {
				System.out.println("Boys Party");
				return ;
			}
		}
		System.out.println("Girls Party");
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for(int i = 0; i<arr.length; i++) {
//			if(map.get(arr[i])==null) {
//				map.put(arr[i], true);
//			}
//			else {
//				System.out.println("Boys Party");
//				return ;
//			}
//		}
//		System.out.println("Girls Party");

	}

}
