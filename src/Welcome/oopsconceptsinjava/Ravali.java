package Welcome.oopsconceptsinjava;

public class Ravali extends Student {
    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    private String subjects;
    private int idno;


    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    @Override
    void Schoolname() {
        System.out.println("Subjects are same");
    }


}

