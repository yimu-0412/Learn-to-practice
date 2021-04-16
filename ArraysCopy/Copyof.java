

public class Copyof{

	public static int[] Arraycopy(int[] arr) {
		int[] ret = new int[arr.length];
		for(int i =0;i < arr.length;i ++){
			ret[i] = arr[i];
		    System.out.print(ret[i] + " ");
		}
		return ret;
	}

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Arraycopy(arr);
    }
}