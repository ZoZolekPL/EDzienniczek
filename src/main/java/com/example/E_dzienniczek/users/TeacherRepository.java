package com.example.E_dzienniczek.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<ModelTeacher, Long> {
}
