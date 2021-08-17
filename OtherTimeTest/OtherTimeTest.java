/*
    * 其他类
    * */
    @Test
    public void test1() {
        //ZoneId: 类中包含了所有的时区信息
        // ZoneId的 getAvailableZoneIds(): 获取所有的 ZoneId
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String s : zoneIds ){
            System.out.println(s);
        }
        System.out.println("*********************************");

        // ZoneId 的 of():获取指定时区的时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);
        System.out.println("*********************************");

        // ZonedDateTime: 带时区的日期时间
        // ZonedDateTime的 now(): 获取本时区的 ZonedDateTime 对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        // ZonedDateTime的 now(ZoneId id): 获取指定时区的 ZonedDateTime 对象
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime1);
        System.out.println("*********************************");

        // Duration: 用于计算两个“时间”间隔，以秒和纳秒为基准
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(15, 23, 32);
        //between():静态方法，返回 Duration 对象，表示两个时间的间隔
        Duration duration = Duration.between(localTime1, localTime);
        System.out.println(duration);

        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());
        System.out.println("*********************************");

        LocalDateTime localDateTime1 = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
        LocalDateTime localDateTime2 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);
        Duration duration1 = Duration.between(localDateTime2, localDateTime1);
        System.out.println(duration1);
    }