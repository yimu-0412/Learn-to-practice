public class toStrings{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(toString(arr));
   }

   public static String toString(int[] array){
   	String ret = "[";
   	for(int i = 0; i < array.length;i ++){
   		//借助String += 进行字符串拼接
   		ret += array[i];
   		//除了最后一个元素之外，其余元素之后应该加上“，”
   		if(i != array.length-1){
   			ret += " ," ;
   		}
   	}
   	ret += "]";
   	return ret;
   }
}