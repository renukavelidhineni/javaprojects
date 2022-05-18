package Welcome.immutability;

public final class Example {
   private final int empid;
    private final String empname;
    private final double salary;
    private final String address;
    private final String phno;

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhno() {
        return phno;
    }

    public String getAddress() {
        return address;
    }

    public Example(int empid, String empname, double salary, String adress, String phno) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.address = adress;
        this.phno = phno;
    }
}
