package kg.ksucta.domain.model;

import kg.ksucta.domain.user.User;

import javax.persistence.*;

/**
 * Created by Bahriddin on 27.04.2017.
 */
@Entity
@Table(name = "MESSAGES")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @Column(name = "created_at")
    private String created_at;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject message;

    public Message(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Subject getMessage() {
        return message;
    }

    public void setMessage(Subject message) {
        this.message = message;
    }
}
