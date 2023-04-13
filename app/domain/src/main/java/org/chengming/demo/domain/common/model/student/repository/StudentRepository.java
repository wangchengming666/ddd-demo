/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.repository;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;

public interface StudentRepository {

    Student getStudentById(String id);
}