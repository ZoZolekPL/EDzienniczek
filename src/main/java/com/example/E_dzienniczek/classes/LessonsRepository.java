package com.example.E_dzienniczek.classes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends CrudRepository<ModelLessons, Long> {
}
