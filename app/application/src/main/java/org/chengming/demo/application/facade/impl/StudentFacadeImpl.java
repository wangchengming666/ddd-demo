/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.application.facade.impl;

import org.chengming.demo.application.service.StudentService;
import org.chengming.demo.facade.api.StudentFacade;
import org.chengming.demo.facade.dto.student.StudentInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chengming
 * @version StudentFacadeImpl.java, v 0.1 2023年04月13日 5:29 PM chengming
 */
@Component
public class StudentFacadeImpl implements StudentFacade {

    @Resource
    private StudentService studentService;

    @Override
    public StudentInfo getStudentById(String id) {
        return studentService.getStudentById(id);
    }
}