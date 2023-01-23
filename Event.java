
import java.util.List;

public class Event {
    private String name;
    private String event;
    private double time;
    private int lane;
    private int points;
    private Athlete athlete;

    public Event(String name, String event, double time, int lane, int points, Athlete athlete) {
        this.name = name;
        this.event = event;
        this.time = time;
        this.lane = lane;
        this.points = points;
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }
}