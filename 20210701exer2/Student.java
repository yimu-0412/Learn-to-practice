package exer2;

public class Student extends Person{
    protected String school=" pku";
    public String getInfo (){
        return "Name: "+ name + " nage : "+ age
                + " school " + school;
    }

}
