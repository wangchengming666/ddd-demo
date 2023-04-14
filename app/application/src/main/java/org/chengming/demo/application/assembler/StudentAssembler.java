/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.application.assembler;

import org.chengming.demo.domain.common.model.student.model.aggregate.Student;
import org.chengming.demo.domain.common.model.student.model.valobj.StudentId;
import org.chengming.demo.facade.dto.student.StudentInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class StudentAssembler implements BaseDTOAssembler<Student, StudentInfo> {

    @Resource
    private StudentFamilyArchiveAssembler studentFamilyArchiveAssembler;

    @Override
    public StudentInfo convertDTO(Student student) {
        if (Objects.isNull(student)) {
            return null;
        }
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setId(student.getStudentId().getValue());
        studentInfo.setName(student.getName());
        studentInfo.setAge(student.getAge());
        studentInfo.setDesc(student.getDesc());
        studentInfo.setStudentFamilyArchiveInfoList(
                studentFamilyArchiveAssembler.convertDTO(student.getStudentFamilyArchiveList()));
        return studentInfo;
    }

    @Override
    public Student fromDTO(StudentInfo studentInfo) {
        if (Objects.isNull(studentInfo)) {
            return null;
        }
        return Student.builder()
                .studentId(new StudentId(studentInfo.getId()))
                .name(studentInfo.getName())
                .age(studentInfo.getAge())
                .desc(studentInfo.getDesc())
                .studentFamilyArchiveList(
                        studentFamilyArchiveAssembler.fromDTO(studentInfo.getStudentFamilyArchiveInfoList()))
                .build();
    }
}