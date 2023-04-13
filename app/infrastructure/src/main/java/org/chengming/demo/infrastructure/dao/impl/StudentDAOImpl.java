/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.chengming.demo.infrastructure.dao.StudentDAO;
import org.chengming.demo.infrastructure.data.mapper.StudentMapper;
import org.chengming.demo.infrastructure.data.object.StudentDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentDAOImpl extends ServiceImpl<StudentMapper, StudentDO> implements StudentDAO {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public StudentDO getStudentById(Long id) {
        return studentMapper.getStudentById(id);
    }
}