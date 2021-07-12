/*
    自定义异常类
*/
 */
public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {

    static final long serialVersionUID = -7034897193246939L;

    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}

class Student{
    private int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }
}