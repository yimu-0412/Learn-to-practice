
/*
    * DateTimeFormatter:格式化或解析日期、时间
    * 类似于SimpleDateFormat
    * */
    @Test
    public void  dateTimeFormatter(){
        // 方式一: 预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        // 格式化 : 日期 -- > 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime); // 2021-08-16T23:36:46.366
        System.out.println(str1); // 2021-08-16T23:36:46.366
        System.out.println("*********************************");

        // 解析 : 字符串 -- > 日期
        TemporalAccessor parse = formatter.parse("2021-08-16T23:36:46.366");
        System.out.println(parse); // {},ISO resolved to 2021-08-16T23:36:46.366
        System.out.println("*********************************");

        /*
        * 方式二：
        *      本地化相关的格式。如：ofLocalizedDateTime()
        *       FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
        * */
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        // 格式化:
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2); // 2021年8月16日
        System.out.println("*********************************");

        // 本地化相关的格式。如：ofLocalizedDate()
        // FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);


        // 格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3); // 2021-8-16
        System.out.println("*********************************");

        /*
        *  重点：
        *      方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        * */

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        // 格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4); // 2021-08-16 11:53:00

        //解析
        TemporalAccessor accessor = formatter3.parse("2019-02-18 03:52:09");
        System.out.println(accessor); // {MinuteOfHour=52, MilliOfSecond=0, NanoOfSecond=0, SecondOfMinute=9, HourOfAmPm=3, MicroOfSecond=0},ISO resolved to 2019-02-18



    }