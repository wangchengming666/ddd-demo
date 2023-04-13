/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.application.service.impl;

import org.chengming.demo.application.assembler.StudentAssembler;
import org.chengming.demo.application.service.StudentService;
import org.chengming.demo.domain.common.model.student.model.aggregate.Student;
import org.chengming.demo.domain.common.model.student.service.StudentQueryService;
import org.chengming.demo.facade.dto.student.StudentInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentQueryService studentQueryService;

    @Resource
    private StudentAssembler studentAssembler;

    @Override
    public StudentInfo getStudentById(String id) {
        Student student = studentQueryService.getStudentById(id);
        return studentAssembler.convertDTO(student);
    }
}