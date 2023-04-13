/**
 * Alipay.com Inc. Copyright (c) 2004-2022 All Rights Reserved.
 */
package org.chengming.demo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Entity <---> DTO
 *
 * @param <S> Entity
 * @param <T> DTO
 */
public interface BaseDTOAssembler<S, T> {

    /**
     * 实体转换为DTO
     *
     * @param s
     * @return
     */
    T convertDTO(S s);

    default List<T> convertDTO(List<S> s) {
        if (s == null || s.size() <= 0) {
            return new ArrayList<>();
        }
        return s.stream().map(this::convertDTO).collect(Collectors.toList());
    }

    /**
     * DTO转换为实体
     *
     * @param t
     * @return
     */
    S fromDTO(T t);

    default List<S> fromDTO(List<T> t) {
        if (t == null || t.size() <= 0) {
            return new ArrayList<>();
        }
        return t.stream().map(this::fromDTO).collect(Collectors.toList());
    }

}
