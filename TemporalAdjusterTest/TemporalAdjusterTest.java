
@Test
    public void test3(){
        // TemporalAdjuster: 时间校正器
        // 获取当前日期的下一个周日是哪天？

        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDateTime localDateTime = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime);

        // 获取下一个工作日是哪天？
        LocalDate localDate = LocalDate.now().with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate date = (LocalDate)temporal;
                if(date.getDayOfWeek().equals((DayOfWeek.FRIDAY))){
                    return date.plusDays(3);
                }else if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                    return date.plusDays(2);
                }else{
                    return date.plusDays(1);
                }
            }
        });

        System.out.println("下一个工作日是：" + localDate);
    }