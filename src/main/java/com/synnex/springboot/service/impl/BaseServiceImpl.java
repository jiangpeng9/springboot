package com.synnex.springboot.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.synnex.springboot.domain.Department;
import com.synnex.springboot.mapper.BaseMapper;
import com.synnex.springboot.query.BaseQuery;
import com.synnex.springboot.service.IBaseService;
import com.synnex.springboot.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    private BaseMapper<T> mapper;
    @Override
    @Transactional
    public void add(T t) {
        mapper.insert(t);
    }

    @Override
    @Transactional
    public void update(T t) {
        mapper.updateByPrimaryKey(t);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Department findOne(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }

    @Override
    public PageResult<T> findByQuery(BaseQuery query) {
        PageHelper.startPage(query.getPage(),query.getRows());
        Page<T> page = (Page)mapper.selectAll();
        return new PageResult<>(page.getTotal(),page.getResult());
    }
}
