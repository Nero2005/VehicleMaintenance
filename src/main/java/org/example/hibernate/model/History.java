package org.example.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class History {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "time", nullable = false)
    private String dateTime;

    @Column(name = "user", nullable = false)
    private String user;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "detail", nullable = false)
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
