    /*
     添加、删除、修改操作：
 Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
 void putAll(Map m):将m中的所有key-value对存放到当前map中
 Object remove(Object key)：移除指定key的key-value对，并返回value
 void clear()：清空当前map中的所有数据
     */
    
     @Test
    public void test(){
        Map map = new HashMap();
        // Map map = new LinkedHashMap();
        // 1.put(Object key,object value):将指定的key - value值添加到(修改)当前的mapzhong
        map.put("AAA",776);
        map.put("BBB",12);
        map.put("CCC",34);
        map.put("VVV",89);

        // 修改
        map.put("VVV",67);
        System.out.println(map); // {AAA=776, CCC=34, BBB=12, VVV=67}

        // 2.putAll(Map m):
        Map map1 = new HashMap();
        map1.put("DDD",12);
        map1.put("SSS",34);

        map.putAll(map1);
        System.out.println(map); // {AAA=776, CCC=34, SSS=34, BBB=12, DDD=12, VVV=67}

        // 3.remove (Object key)
        Object value = map.remove("AAA");
        System.out.println(value); // 若没有 返回值为null // 776
        System.out.println(map); // {CCC=34, SSS=34, BBB=12, DDD=12, VVV=67}

        // 4.clear():清空当前的map
        map.clear(); // 与map = null 不同
        System.out.println(map.size()); // 0
        System.out.println(map); // {}
    }