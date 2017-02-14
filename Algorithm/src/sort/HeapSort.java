package sort;

public class HeapSort {

	public static void main(String[] args) {
		/*
			  10
		  7		  8
		5	3	1	
		 */
		int[] arr = new int[]{10,7,8,5,3,1};
		int[] arr2 = new int[]{1,3,5,8,7,10};
		
		System.out.println(isMaxHeap(arr));
		System.out.println(isMinHeap(arr2));
		
	}
	public static boolean isMaxHeap(int[] arr){
		for(int i=0; i< arr.length; i++){
			//System.out.println("arr["+i+"]: " + arr[i]);
			if(2*i+1 < arr.length == true && 2*i+2 < arr.length == true){
				//System.out.println("arr[i]: " + arr[i]+" | arr[(2*i)+1]: " + arr[2*i+1]+" | arr[(2*i)+2]: " + arr[2*i+2]);
				if(arr[i] > arr[2*i+1] == false || arr[i] > arr[2*i+2] == false){
					return false;
				}
			}else{
				break;
			}
		}		
		return true;
	}
	public static boolean isMinHeap(int[] arr){
		for(int i=0; i< arr.length; i++){
			if(2*i+1 < arr.length == true && 2*i+2 < arr.length == true){
				if(arr[i] < arr[2*i+1] == false || arr[i] < arr[2*i+2] == false){
					return false;
				}
			}else{
				break;
			}
		}
		return true;
	}

}
