package com.synnex.springboot.service;

import com.synnex.springboot.domain.Department;
import com.synnex.springboot.query.BaseQuery;
import com.synnex.springboot.util.PageResult;

import java.util.List;

public interface IBaseService<T> {
    void add(T t);
    void update(T t);
    void delete(Long id);
    Department findOne(Long id);
    List<T> findAll();
    PageResult<T> findByQuery(BaseQuery query);
}
