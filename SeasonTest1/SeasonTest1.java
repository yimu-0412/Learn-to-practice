/**
 * @author wangyimu
 * @create 2021-08-19-21:15
 */


interface Info{
    void show();
}
enum Season1 implements Info {

    // 1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春风又绿江南岸"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUNMER("夏天","映日荷花别样红") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋水共长天一色") {
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","窗含西岭千秋雪") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    // 2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3.私有化类的构造器,并给对象属性赋值
    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 4.其他诉求
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    
}


public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        // toString():返回枚举类对象的名称
        System.out.println(spring.toString());
        // System.out.println(Season1.class.getClasses());
        System.out.println("****************");

        //values():返回所有的枚举类对象构成的数组,))：可以把一个字符串转为对应的枚举类对象。
        Season1[] values = Season1.values();
        for(int i = 0; i < values.length;i ++){
            System.out.println(values[i]);
        }
        System.out.println("****************");

        // valueOf(String objName):返回枚举类中对象名是objName的对象。
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        System.out.println("****************");
        winter.show();
        System.out.println("****************");

        // 如果没有objName的枚举类对象，则抛异常：IllegalArgumentException
        Season1 winter1 = Season1.valueOf("WINTER1");
        System.out.println(winter1);
        System.out.println("****************");
    }


}