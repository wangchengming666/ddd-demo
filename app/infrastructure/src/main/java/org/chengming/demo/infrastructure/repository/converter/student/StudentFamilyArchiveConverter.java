/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.repository.converter.student;

import org.chengming.demo.domain.common.model.student.model.entity.StudentFamilyArchive;
import org.chengming.demo.infrastructure.data.object.StudentFamilyArchiveDO;
import org.chengming.demo.infrastructure.repository.converter.BaseDOConverter;
import org.springframework.stereotype.Component;

@Component
public class StudentFamilyArchiveConverter implements BaseDOConverter<StudentFamilyArchive, StudentFamilyArchiveDO> {

    @Override
    public StudentFamilyArchiveDO toDO(StudentFamilyArchive domain) {
        return null;
    }

    @Override
    public StudentFamilyArchive fromDO(StudentFamilyArchiveDO dataobject) {
        return null;
    }
}