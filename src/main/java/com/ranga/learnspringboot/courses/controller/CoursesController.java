package com.ranga.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranga.learnspringboot.courses.bean.Course;

@RestController
public class CoursesController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return List.of(new Course(1,"RESTfull web services","pushpakcodes.me"),
                        new Course(2,"microServices","pushpakcodes.me"),
                        new Course(3,"java and wonderful code.","pushpakcodes.me"),
                        new Course(4,"coding Train Javascript","aliencodes.me"));
    }

    @GetMapping("/courses/1")
    public Course getOneCourse(){
        return new Course(1,"RESTfull web services","pushpakcodes.me");
    }
}
