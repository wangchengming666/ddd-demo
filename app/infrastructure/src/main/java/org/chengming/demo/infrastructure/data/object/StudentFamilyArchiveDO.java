/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.data.object;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "student_family_archive")
public class StudentFamilyArchiveDO {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private Long studentId;

    private String archiveName;

    private String archiveDesc;
}