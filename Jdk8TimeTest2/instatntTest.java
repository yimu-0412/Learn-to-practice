 /*
        Instant的使用
        类似于 java.util.Date类
    */
    @Test
    public void instatnt(){
        //  静态方法,返回默认UTC时区的Instant类的对象
        Instant instant = Instant.now();
        System.out.println(instant); // 2021-08-16T15:17:45.765Z
        System.out.println("*********************************");

        // 添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant); // 2021-08-16T15:17:45.765Z
        System.out.println(offsetDateTime); // 2021-08-16T23:21:28.060+08:00
        System.out.println("*********************************");

        // toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  ---> Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli); // 1629127397864
        System.out.println("*********************************");

        // ofEpochMilli():通过给定的毫秒数，获取Instant实例  -->Date(long millis)
        Instant ofEpochMilli = Instant.ofEpochMilli(1629127397864L);
        System.out.println(ofEpochMilli); // 2021-08-16T15:23:17.864Z
    }