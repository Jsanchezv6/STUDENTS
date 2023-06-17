package com.springbootcrud.springboot.services;





import com.springbootcrud.springboot.models.Grade;
import com.springbootcrud.springboot.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public List<Grade> getGradesByStudentAndCourse(Long studentId, Long courseId) {
        // Lógica para obtener las calificaciones de un estudiante en un curso específico
        return null;
    }

    @Override
    public List<Grade> getGradesByStudent(Long studentId) {
        // Lógica para obtener todas las calificaciones de un estudiante
        return null;
    }
}
