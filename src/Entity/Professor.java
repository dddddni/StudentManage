package Entity;

public class Professor {
    public Professor(String name, String subject, int number) {
        this.name = name;
        this.subject = subject;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String name;
    private String subject;
    private int number;
}
