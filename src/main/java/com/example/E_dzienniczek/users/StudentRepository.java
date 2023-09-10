package com.example.E_dzienniczek.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<ModelStudent, Long> {
}
