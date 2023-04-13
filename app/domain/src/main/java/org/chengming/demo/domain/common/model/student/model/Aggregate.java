package org.chengming.demo.domain.common.model.student.model;

import java.io.Serializable;

public interface Aggregate<ID extends Serializable & Identifier> extends Entity<ID> {
}
