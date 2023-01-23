public class Athlete {
    private String name;
    private int grade;
    private String gender;

    public Athlete(String name, int grade, String gender) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}