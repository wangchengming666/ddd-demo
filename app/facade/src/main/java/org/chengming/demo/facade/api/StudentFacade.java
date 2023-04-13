/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.facade.api;

import org.chengming.demo.facade.dto.student.StudentInfo;

public interface StudentFacade {

    /**
     * 根据id查询学生信息
     *
     * @param id
     * @return
     */
    StudentInfo getStudentById(String id);
}