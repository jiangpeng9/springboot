package com.synnex.springboot.mapper;

import com.synnex.springboot.domain.Department;
import com.synnex.springboot.query.BaseQuery;

import java.util.List;
public interface BaseMapper<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    Department selectByPrimaryKey(Long id);

    List<T> selectAll();

    int updateByPrimaryKey(T record);

    List<T> findByQuery(BaseQuery query);
}
