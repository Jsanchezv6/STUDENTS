package com.springbootcrud.springboot.controllers;

import com.springbootcrud.springboot.models.Grade;
import com.springbootcrud.springboot.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeService.createGrade(grade);
    }

    @GetMapping("/student/{studentId}/course/{courseId}")
    public List<Grade> getGradesByStudentAndCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        return gradeService.getGradesByStudentAndCourse(studentId, courseId);
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudent(@PathVariable Long studentId) {
        return gradeService.getGradesByStudent(studentId);
    }
}
