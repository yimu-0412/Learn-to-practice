   /*
 元素查询的操作：
 Object get(Object key)：获取指定key对应的value
 boolean containsKey(Object key)：是否包含指定的key
 boolean containsValue(Object value)：是否包含指定的value
 int size()：返回map中key-value对的个数
 boolean isEmpty()：判断当前map是否为空
 boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     */
    
     @Test
    public void test1(){
        Map map = new HashMap();

        map.put("AAA",776);
        map.put("BBB",12);
        map.put("CCC",34);
        map.put("VVV",89);

        // get(Object key):
        System.out.println(map.get("AAA")); // 776

        // containskey(Object key)
        boolean isKeyExist = map.containsKey("bb");
        System.out.println(isKeyExist); // false

        // containsValue(Object value):
        boolean isValueExist = map.containsValue(12);
        System.out.println(isValueExist); // true

        map.clear();

        // isEmpty()
        System.out.println(map.isEmpty()); // true
    }