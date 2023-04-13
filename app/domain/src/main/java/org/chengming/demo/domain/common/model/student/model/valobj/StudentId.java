/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package org.chengming.demo.domain.common.model.student.model.valobj;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.chengming.demo.domain.common.model.student.model.Identifier;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode
public class StudentId implements Identifier {

    @Getter
    private String value;

    public StudentId(@NotBlank String value) {
        this.value = value;
    }
}