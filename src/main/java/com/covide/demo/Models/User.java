package com.covide.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userVac")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
     private String idDetail;
    private String idType;
    private String contactnumber;
    private String vaccineName;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getIdDetail() {
        return idDetail;
    }
    public void setIdDetail(String idDetail) {
        this.idDetail = idDetail;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
   
     @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", idDetail=" + idDetail + ", idType=" + idType
                + ", contactnumber=" + contactnumber + ", vaccineName=" + vaccineName + "]";
    }
}
