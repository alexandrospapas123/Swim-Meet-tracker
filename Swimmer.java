
class Swimmer {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearGroup;
    private double time;

    public Swimmer(String firstName, String lastName, String gender, int yearGroup, double time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearGroup = yearGroup;
        this.time = time;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearGroup() {
        return yearGroup;
    }

    public void setYearGroup(int yearGroup) {
        this.yearGroup = yearGroup;
    }

    public double getTimes() {
        return time;
    }

    public void setTimes(double time) {
        this.time = time;
    }
}
