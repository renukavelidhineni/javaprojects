package Welcome.immutability;

public class Main {
    public static void main(String[] args) {
        Example exp=new Example(66,"xyz",25000,"hyd","9995554444");
        System.out.println("employee id :" + exp.getEmpid());
        System.out.println("employee name :" + exp.getEmpname());
        System.out.println("employee salary :" + exp.getSalary());
        System.out.println("employee address :" + exp.getAddress());
        Long.parseLong(exp.getPhno());
        System.out.println("employee phone number : " + exp.getPhno());


    }
}
