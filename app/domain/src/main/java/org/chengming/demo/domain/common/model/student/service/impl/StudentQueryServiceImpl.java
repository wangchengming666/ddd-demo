/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.service.impl;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;
import org.chengming.demo.domain.common.model.student.repository.StudentRepository;
import org.chengming.demo.domain.common.model.student.service.StudentQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentQueryServiceImpl implements StudentQueryService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }
}