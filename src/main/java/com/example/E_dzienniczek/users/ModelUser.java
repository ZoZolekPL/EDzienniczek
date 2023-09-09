package com.example.E_dzienniczek.users;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class ModelUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(nullable = false)
    private Long PersonId;
    @Column(nullable = false)
    private String TypeUsesr;
    @Column(nullable = false)
    private String Email;
    @Column(nullable = false)
    private String Password;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getPersonId() {
        return PersonId;
    }

    public void setPersonId(Long personId) {
        PersonId = personId;
    }

    public String getTypeUsesr() {
        return TypeUsesr;
    }

    public void setTypeUsesr(String typeUsesr) {
        TypeUsesr = typeUsesr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public ModelUser(Long userId, Long personId, String typeUsesr, String email, String password) {
        UserId = userId;
        PersonId = personId;
        TypeUsesr = typeUsesr;
        Email = email;
        Password = password;
    }
}
