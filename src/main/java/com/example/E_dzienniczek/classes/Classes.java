package com.example.E_dzienniczek.classes;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ClassId;
    @Column(nullable = false)
    private String ClassName;
    @ManyToMany
    @JoinTable(
            name = "classes_lessons",
            joinColumns = @JoinColumn(name = "Classes_ClassId"),
            inverseJoinColumns = @JoinColumn(name = "ModelLessons_LessonId")
    )
    private Set<ModelLessons> lessons = new HashSet<>();

    public Classes(Long classId, String className, Set<ModelLessons> lessons) {
        ClassId = classId;
        ClassName = className;
        this.lessons = lessons;
    }

    public Long getClassId() {
        return ClassId;
    }

    public void setClassId(Long classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public Set<ModelLessons> getLessons() {
        return lessons;
    }

    public void setLessons(Set<ModelLessons> lessons) {
        this.lessons = lessons;
    }
}
