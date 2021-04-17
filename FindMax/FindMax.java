


public class FindMax{
	public static int find(int[] arr){
    //int max = 0;//不可以直接定义max为最大值
		int max = arr[0];
		for(int i = 0;i < arr.length; i ++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] atgs){
		int[] arr = {1,5,8,4,17,12};
		System.out.println(find(arr));
	}
}