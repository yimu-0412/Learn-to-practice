public class TestDemo{

   public static int findNum(int[] array){
      int i = 0;
      int ret = 0;
      for(i = 0; i < array. length; i ++){
      	  ret ^= array[i];
      }
      return ret;
   }

   public static void main(String[] args){
      int[] array ={ 1 , 1 , 2, 2 ,3 ,4 , 4};
      System.out.println(findNum(array));

   }
}