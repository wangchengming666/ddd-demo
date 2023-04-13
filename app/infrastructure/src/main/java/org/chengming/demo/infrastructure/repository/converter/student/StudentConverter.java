/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.repository.converter.student;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;
import org.chengming.demo.domain.common.model.student.model.valobj.StudentId;
import org.chengming.demo.infrastructure.data.object.StudentDO;
import org.chengming.demo.infrastructure.repository.converter.BaseDOConverter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class StudentConverter implements BaseDOConverter<Student, StudentDO> {

    @Override
    public StudentDO toDO(Student domain) {
        if (Objects.isNull(domain)) {
            return null;
        }
        StudentDO studentDO = new StudentDO();
        studentDO.setId(Long.valueOf(domain.getStudentId().getValue()));
        studentDO.setName(domain.getName());
        studentDO.setAge(domain.getAge());
        studentDO.setDesc(domain.getDesc());
        return studentDO;
    }

    @Override
    public Student fromDO(StudentDO dataobject) {
        if (Objects.isNull(dataobject)) {
            return null;
        }
        return Student.builder()
                .studentId(new StudentId(dataobject.getId().toString()))
                .name(dataobject.getName())
                .age(dataobject.getAge())
                .desc(dataobject.getDesc())
                .build();
    }
}