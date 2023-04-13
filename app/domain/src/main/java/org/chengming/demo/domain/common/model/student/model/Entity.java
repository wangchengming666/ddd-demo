package org.chengming.demo.domain.common.model.student.model;

import java.io.Serializable;

public interface Entity<ID extends Serializable & Identifier> extends Identifiable<ID> {
}
