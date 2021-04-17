


public class Transform{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		transForm(arr);
		PrintArray(transForm(arr));
		System.out.println();
		PrintArray(arr);

	}
	public static void PrintArray(int[] array){
        for(int i = 0;i < array.length;i ++){
			System.out.print(array[i] + " ");
	    }
    }
	public static int[] transForm(int[] array){
		int[] ret = new int[array.length];
		for(int i = 0;i < array.length;i ++){
			ret[i] = array[i] * 2;	
		}
		return ret;
	}







} 