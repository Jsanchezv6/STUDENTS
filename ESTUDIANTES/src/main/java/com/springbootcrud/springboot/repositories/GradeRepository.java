package com.springbootcrud.springboot.repositories;

import com.springbootcrud.springboot.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

}
