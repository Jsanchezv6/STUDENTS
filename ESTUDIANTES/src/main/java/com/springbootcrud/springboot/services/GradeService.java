package com.springbootcrud.springboot.services;


import com.springbootcrud.springboot.models.Grade;
import java.util.List;

public interface GradeService {

    Grade createGrade(Grade grade);

    List<Grade> getGradesByStudentAndCourse(Long studentId, Long courseId);

    List<Grade> getGradesByStudent(Long studentId);

}
