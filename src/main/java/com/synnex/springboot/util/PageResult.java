package com.synnex.springboot.util;

import java.util.ArrayList;
import java.util.List;
//easyui需要分页的数据
public class PageResult<T> {
    private Long total = 0L;
    private List<T> rows = new ArrayList<>();

    public PageResult() {
    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
