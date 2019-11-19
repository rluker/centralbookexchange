package com.centralbookexchange.webapp.db;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class PersonDB {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fName;
    private String lName;
    private String email;
    private String userName;
    private String admin;

    public PersonDB() {
    }

    public PersonDB (String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public PersonDB(String fName, String lName, String email, String userName, String admin) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.userName = userName;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return fName + ' ' + lName;
    }
    public void setName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + fName + ' ' + lName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                '}';
    }
}
