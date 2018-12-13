package com.assessment.Motel666.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Motel")
public class Motel {

    @Id
    @Column(name = "User_Id")
    private String userId;
    @Column(name = "Type")
    private String type;
    @Column(name = "Timestamp")
    private String timestamp;
    @Column(name = "Context")
    private String context;

    public Motel(String userId, String type, String timestamp, String context) {
        this.userId = userId;
        this.type = type;
        this.timestamp = timestamp;
        this.context = context;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
