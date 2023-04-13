/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.application.service;


import org.chengming.demo.facade.dto.student.StudentInfo;

public interface StudentService {

    StudentInfo getStudentById(String id);
}