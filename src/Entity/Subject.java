package Entity;

public class Subject {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Subject(String subject, String grade) {
        this.subject = subject;
        this.grade = grade;
    }

    private String subject;

    public Subject(String subject) {
        this.subject = subject;
    }

    private String grade;
}
