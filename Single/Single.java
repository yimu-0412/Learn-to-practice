// 饿汉式
class Single{
    // 1. 私有化类的构造器
    private Single(){

    }

    // 2.内部创建类的对象
    // 4.要求此对象也必须是static
    private static Single instance = new Single();

    // 3.提供公共的静态类方法，获取类对象
    public static Single getInstance(){
        return instance;
    }
}

class Single1{
    // 1.私有化类的构造器
    private Single1(){

    }

    // 2.声明当前类对象，没有初始化
    // 4.此对象也必须声明为static
    private static Single1 instance = null;
    static{
        instance = new Single1();
    }

    // 3.提供公共静态类方法，获取类的对象
    public static Single1 getInstance(){
        return instance;
    }
}
