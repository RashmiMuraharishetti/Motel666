package com.assessment.Motel666.Entity;


import javax.persistence.*;

@Entity
@Table(name = "Motel")
public class Motel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "User_Id")
    private String userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "Timestamp")
    private long timestamp;
    @Column(name = "Context")
    private String context;

    public Motel() {
    }

    public Motel(Long id, String userId, String type, long timestamp, String context) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.timestamp = timestamp;
        this.context = context;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
