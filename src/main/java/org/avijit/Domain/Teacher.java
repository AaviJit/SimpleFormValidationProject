package org.avijit.Domain;



import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 5,max = 20)
    private String name;
    private String userName;
    private String position;
    private String mobile;

    @Transient
    private String dob_str;

    private LocalDate dob;

    private String address;
    private String password;


    public Teacher() {
    }

    public Teacher(String name, String userName, String position, String mobile, LocalDate dob, String address, String password) {
        this.name = name;
        this.userName = userName;
        this.position = position;
        this.mobile = mobile;
        this.dob = dob;
        this.address = address;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob_str() {
        return dob_str;
    }

    public void setDob_str(String dob_str) {
        this.dob_str = dob_str;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
