/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.chengming.demo.domain.common.model.student.model.Entity;
import org.chengming.demo.domain.common.model.student.model.valobj.StudentFamilyArchiveId;
import org.chengming.demo.domain.common.model.student.model.valobj.StudentId;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentFamilyArchive implements Entity<StudentFamilyArchiveId> {

    private StudentFamilyArchiveId studentFamilyArchiveId;

    private StudentId studentId;

    private String archiveName;

    private String archiveDesc;

    @Override
    public StudentFamilyArchiveId getId() {
        return studentFamilyArchiveId;
    }
}