/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.model.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.chengming.demo.domain.common.model.student.model.Aggregate;
import org.chengming.demo.domain.common.model.student.model.entity.StudentFamilyArchive;
import org.chengming.demo.domain.common.model.student.model.valobj.StudentId;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student implements Aggregate<StudentId> {

    private StudentId studentId;

    private String name;

    private Integer age;

    private String desc;

    private List<StudentFamilyArchive> studentFamilyArchiveList;

    @Override
    public StudentId getId() {
        return studentId;
    }
}