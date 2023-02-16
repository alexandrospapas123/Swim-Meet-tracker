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
