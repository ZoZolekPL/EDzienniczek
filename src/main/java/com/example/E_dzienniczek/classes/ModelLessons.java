package com.example.E_dzienniczek.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "lessons")
public class ModelLessons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LessonId;
}
