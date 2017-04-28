package kg.ksucta.domain.model;

import javax.persistence.*;

/**
 * Created by o2b3k on 4/22/17.
 */
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "time")
    private String time;

    @Column(name = "name")
    private String name;

    @Column(name = "room")
    private String room;

    @Column(name = "day_of_weeks")
    private String day_of_weeks;

    @Column(name = "active")
    private boolean active;

    public Subject(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDay_of_weeks() {
        return day_of_weeks;
    }

    public void setDay_of_weeks(String day_of_weeks) {
        this.day_of_weeks = day_of_weeks;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
