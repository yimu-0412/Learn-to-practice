public class SingletonDesign {

    // 懒汉式
    // 1。私有化类的空参构造器
    private SingletonDesign(){

    }

    // 2. 声明当前类对象，没初始化
    // 4. 此对象也必须声明为static
    private static SingletonDesign instance = null;

    // 3. 声明public、static的返回值当前类的方法
    public static SingletonDesign getInstance(){

        if(instance == null){
            instance = new SingletonDesign();
        }
        return instance;
    }

}

