/**
 * Alipay.com Inc. Copyright (c) 2004-2022 All Rights Reserved.
 */
package org.chengming.demo.infrastructure.repository.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Entity <---> DO
 *
 * @param <S> Entity
 * @param <T> DO
 */
public interface BaseDOConverter<S, T> {

    /**
     * 实体转成DO
     *
     * @param domain
     * @return
     */
    T toDO(S domain);

    default List<T> toDO(List<S> domains) {
        if (null == domains || domains.size() <= 0) {
            return new ArrayList<>();
        } else {
            return domains.stream().map(this::toDO).collect(Collectors.toList());

        }
    }

    /**
     * DO转成实体
     *
     * @param dataobject
     * @return
     */
    S fromDO(T dataobject);

    default List<S> fromDO(List<T> dataobjects) {
        if (null == dataobjects || dataobjects.size() <= 0) {
            return new ArrayList<>();
        } else {
            return dataobjects.stream().map(this::fromDO).collect(Collectors.toList());
        }
    }
}
