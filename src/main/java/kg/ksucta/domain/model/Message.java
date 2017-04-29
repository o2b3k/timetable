package kg.ksucta.domain.model;

import kg.ksucta.domain.user.User;

import javax.persistence.*;

/**
 * Created by Bahriddin on 27.04.2017.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "subject_id")
    private Integer subject_id;

    @Column(name = "text")
    private String text;

    @Column(name = "created_at")
    private String created_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;


    public Message(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}
