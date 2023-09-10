package com.example.E_dzienniczek.users;

import jakarta.persistence.*;

import java.util.Date;
import java.util.ServiceLoader;

@Entity
@Table(name = "students")

public class ModelStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    @Column(nullable=false)
    private String Name;

    @Column(nullable= true)
    private String SecondName;
    @Column(nullable = false)
    private String Lastname;
    @Column(nullable = false)
    private int PESEL;
    @Column(nullable = false)
    private Date BirthDay;
    @JoinColumn(name = "Classes_ClassId")
    private Long ClassName;

    public ModelStudent(Long idStudent, String name, String secondName, String lastname, int PESEL, Date birthDay, Long className) {
        this.idStudent = idStudent;
        Name = name;
        SecondName = secondName;
        Lastname = lastname;
        this.PESEL = PESEL;
        BirthDay = birthDay;
        ClassName = className;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getPESEL() {
        return PESEL;
    }

    public void setPESEL(int PESEL) {
        this.PESEL = PESEL;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public Long getClassName() {
        return ClassName;
    }

    public void setClassName(Long className) {
        ClassName = className;
    }
}
