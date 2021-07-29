
/*
	泛型类和泛型方法的区别：
		class MyArrays<E extends Number>{}      
		E 是 Number的子类或者Number本身 

*/
// 泛型类
class Algorithm<T extends Comparable<T>>  {
	public T findMax(T[] array){
		T max = array[0];
		for(int i = 1; i < array.length; i ++){
			if(max.ComparareTo(array[i]) < 0){
				max = array[i];
			}
		}
		return max;
	}
}


class Algorithm1{
	// 泛型方法
	public static<T extends Comparable<T>> T findMax(T[] array){
		T max = array[0];
		for(int i = 1; i < array.length; i ++){
			if(max.ComparareTo(array[i]) < 0){
				max = array[i];
			}
		}
		return max;
	}
}

public class Test{
	public static void main(String[] args) {
		// 泛型类测试
		Algorithm<Integer> algorithm = new Algorithm<>();
		Integer integer = {1,2.3,57,9,0};
		Integer max1 = algorithm.findMax(integer);
		System.out.printf(max1);

		// 泛型方法测试:会根据 形参的类型 推导出 整个泛型的类型参数
		Integer max2 = Algorithm1.<Integer>findMax(integer);
		System.out.printf(max2);

		Integer max3 = Algorithm1.findMax(integer);
		// 一般这里就省略了
		System.out.printf(max2);
	}
}
















































