/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.service;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;

public interface StudentQueryService {

    Student getStudentById(String id);
}