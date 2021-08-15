字符串"2020-09-08"转换为java.sql.Date
@Test
    public void testExer() throws ParseException {
        String birth = "1995-05-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }