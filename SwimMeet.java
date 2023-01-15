import java.util.ArrayList;

public class SwimMeet {
    private ArrayList<String> categories;
    private ArrayList<Double> times;
    private ArrayList<String> names;
    public ArrayList<Swimmer> swimmers;

    public SwimMeet() {
        categories = new ArrayList<String>();
        times = new ArrayList<Double>();
        names = new ArrayList<String>();
        swimmers = new ArrayList<Swimmer>();
    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public void addTime(double time) {
        times.add(time)
;
    }

    public void addName(String name) {
        names.add(name);
    }

    public void addSwimmer(Swimmer swimmer) {
        swimmers.add(swimmer);
    }

    public void editSwimmer(int index, Swimmer swimmer) {
        swimmers.set(index, swimmer);
    }

    public void deleteSwimmer(int index) {
        swimmers.remove(index);
    }
}

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
        this.time=time;
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