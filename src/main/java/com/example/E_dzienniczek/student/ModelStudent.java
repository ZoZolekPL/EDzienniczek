package com.example.E_dzienniczek.student;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity

public class ModelStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String Name;
    


}
