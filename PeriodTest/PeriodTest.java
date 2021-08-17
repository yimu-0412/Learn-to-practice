@Test
    public void test2() {
        // Period: 用于计算两个“日期”间隔，以年、月、日衡量
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2024, 6, 20);

        Period period = Period.between(localDate, localDate1);
        System.out.println(period); // P2Y10M3D
        System.out.println("*********************************");

        System.out.println(localDate);
        System.out.println(period.getYears()); // 2
        System.out.println(period.getMonths()); // 10
        System.out.println(period.getDays()); // 3
        System.out.println("*********************************");

        Period period1 = period.withYears(4);
        System.out.println(period1); // P4Y10M3D
    }