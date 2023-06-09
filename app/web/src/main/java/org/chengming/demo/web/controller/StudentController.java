/**
 * Alipay.com Inc. Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.web.controller;

import org.chengming.demo.application.service.StudentService;
import org.chengming.demo.facade.dto.student.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wapi/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudentById")
    public StudentInfo getStudentById(@RequestParam String id) {
        return studentService.getStudentById(id);
    }

}
