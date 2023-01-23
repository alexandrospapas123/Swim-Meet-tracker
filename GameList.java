import java.util.List;

public class GameList {
    private String homeTeam;
    private String visitingTeam;
    private List<Event> events;

    public GameList(String homeTeam, String visitingTeam, List<Event> events) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.events = events;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }
}
