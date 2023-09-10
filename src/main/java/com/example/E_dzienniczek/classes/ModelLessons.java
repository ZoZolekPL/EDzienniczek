package com.example.E_dzienniczek.classes;

import com.example.E_dzienniczek.users.ModelTeacher;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lessons")
public class ModelLessons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LessonId;
    @Column(nullable = false)
    private String SubjectName;


    @ManyToMany
    @JoinTable(
            name = "subject_teacher",
            joinColumns = @JoinColumn(name = "ModelLessons_LessonId"),
            inverseJoinColumns = @JoinColumn(name = "ModelTeacher_TeacherId")
    )
    private Set<ModelTeacher> lessons = new HashSet<>();

    public ModelLessons(Long lessonId, String subjectName, Set<ModelTeacher> lessons) {
        LessonId = lessonId;
        SubjectName = subjectName;
        this.lessons = lessons;
    }

    public Long getLessonId() {
        return LessonId;
    }

    public void setLessonId(Long lessonId) {
        LessonId = lessonId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public Set<ModelTeacher> getLessons() {
        return lessons;
    }

    public void setLessons(Set<ModelTeacher> lessons) {
        this.lessons = lessons;
    }
}
