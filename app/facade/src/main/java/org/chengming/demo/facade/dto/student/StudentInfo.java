/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.facade.dto.student;

import lombok.Data;

import java.util.List;

@Data
public class StudentInfo {

    private String id;

    private String name;

    private Integer age;

    private String desc;

    private List<StudentFamilyArchiveInfo> studentFamilyArchiveInfoList;
}