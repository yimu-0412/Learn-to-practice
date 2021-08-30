   /*
 元视图操作的方法：
 Set keySet()：返回所有key构成的Set集合
 Collection values()：返回所有value构成的Collection集合
 Set entrySet()：返回所有key-value对构成的Set集合

 */

 // 元视图操作的方法
    //  Set keySet(): 返回所有key值构成的Set集合
    // Collection values()
    // Set entrySet()
    @Test
    public void test2(){
        Map map = new HashMap();

        map.put("AAA",776);
        map.put("BBB",12);
        map.put("CCC",34);
        map.put("VVV",89);

        // 遍历所有的key值
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " "); // AAA CCC BBB VVV
        }

        System.out.println();
        System.out.println("************************");

        // 遍历所有的value值：values()
        Collection values = map.values();
        for(Object obj : values) {
            System.out.print(obj + " "); // 776 34 12 89
        }
        System.out.println();
        System.out.println("************************");

        // 方式一：
        //遍历所有的 key - values
        // entrySet():
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj = iterator1.next();
            // entrySet()集合里的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.print(entry.getKey() + "-->" + entry.getValue() + " "); // AAA-->776 CCC-->34 BBB-->12 VVV-->89
        }

        System.out.println();
        System.out.println("************************");

        // 方式二：
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.print(key + "-->" + value + " "); // AAA-->776 CCC-->34 BBB-->12 VVV-->89
        }


    }