package com.springbootcrud.springboot.services;


import com.springbootcrud.springboot.models.Course;
import com.springbootcrud.springboot.services.CourseService;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course createCourse(Course course);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);

}
