package com.example.E_dzienniczek.users;

import com.example.E_dzienniczek.classes.ModelLessons;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "teachers")
public class ModelTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TeacherId;

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
    @ManyToMany
    @JoinTable(
            name = "teacher_subject",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "ModelLessons_LessonId")
    )
    private Set<ModelLessons> subjects = new HashSet<>();

    public ModelTeacher(Long teacherId, String name, String secondName, String lastname, int PESEL, Date birthDay, Set<ModelLessons> subjects) {
        TeacherId = teacherId;
        Name = name;
        SecondName = secondName;
        Lastname = lastname;
        this.PESEL = PESEL;
        BirthDay = birthDay;
        this.subjects = subjects;
    }

    public Long getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(Long teacherId) {
        TeacherId = teacherId;
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

    public Set<ModelLessons> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<ModelLessons> subjects) {
        this.subjects = subjects;
    }
}
