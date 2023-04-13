/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.application.assembler;

import org.chengming.demo.application.BaseDTOAssembler;
import org.chengming.demo.domain.common.model.student.model.entity.StudentFamilyArchive;
import org.chengming.demo.facade.dto.student.StudentFamilyArchiveInfo;
import org.springframework.stereotype.Component;

@Component
public class StudentFamilyArchiveAssembler implements BaseDTOAssembler<StudentFamilyArchive, StudentFamilyArchiveInfo> {

    @Override
    public StudentFamilyArchiveInfo convertDTO(StudentFamilyArchive studentFamilyArchive) {
        return null;
    }

    @Override
    public StudentFamilyArchive fromDTO(StudentFamilyArchiveInfo studentFamilyArchiveInfo) {
        return null;
    }
}