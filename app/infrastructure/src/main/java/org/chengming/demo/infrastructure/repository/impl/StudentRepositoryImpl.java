/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.repository.impl;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;
import org.chengming.demo.domain.common.model.student.repository.StudentRepository;
import org.chengming.demo.infrastructure.dao.StudentDAO;
import org.chengming.demo.infrastructure.data.object.StudentDO;
import org.chengming.demo.infrastructure.repository.converter.student.StudentConverter;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Resource
    private StudentDAO studentDAO;

    @Resource
    private StudentConverter studentConverter;

    @Override
    public Student getStudentById(String id) {
        StudentDO student = studentDAO.getStudentById(Long.valueOf(id));
        return studentConverter.fromDO(student);
    }
}