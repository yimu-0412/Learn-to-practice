
/*
	上界： <? extends 上界>
	下界： <? super 下界>  传入的类型是下界的父类或者是下界本身

*/

// 通配符练习
class PrinTest{
	public static<T> void print1(ArrayList<T> list){
		for(T t: list){
			System.out.print(t);
		}

	}

	// 代表通配符：一般出现在源码中，适用于读。上界和泛型的的上界相同
	public static<T> void print2(ArrayList<?> list){
		for(? t: list){
			System.out.print(t);
		}

	}	
}


public class Test{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(36);
		list.add(65);
		PrintTest.print1(list);
		PrintTest.print2(list);
	}	
}
















































