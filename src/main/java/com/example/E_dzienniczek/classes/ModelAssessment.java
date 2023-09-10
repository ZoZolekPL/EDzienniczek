package com.example.E_dzienniczek.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "assessment")
public class ModelAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AsseId;
    @Column(nullable = false)
    private float Libra;
    @Column(nullable = false)
    private int Value;
    @JoinColumn(name = "ModelStudent_idStudent")
    private Long StudentId;

    @JoinColumn(name = "ModelTeacher_TeacherId")
    private Long TeacherId;

    @JoinColumn(name = "ModelLessons_LessonIdt")
    private Long LessonId;

    public ModelAssessment(Long asseId, float libra, int value, Long studentId, Long teacherId, Long lessonId) {
        AsseId = asseId;
        Libra = libra;
        Value = value;
        StudentId = studentId;
        TeacherId = teacherId;
        LessonId = lessonId;
    }

    public Long getAsseId() {
        return AsseId;
    }

    public void setAsseId(Long asseId) {
        AsseId = asseId;
    }

    public float getLibra() {
        return Libra;
    }

    public void setLibra(float libra) {
        Libra = libra;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public Long getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(Long teacherId) {
        TeacherId = teacherId;
    }

    public Long getLessonId() {
        return LessonId;
    }

    public void setLessonId(Long lessonId) {
        LessonId = lessonId;
    }
}
