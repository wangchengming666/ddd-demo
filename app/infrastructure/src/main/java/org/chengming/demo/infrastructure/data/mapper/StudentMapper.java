/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.chengming.demo.infrastructure.data.object.StudentDO;

public interface StudentMapper extends BaseMapper<StudentDO> {

    StudentDO getStudentById(@Param("id") Long id);
}