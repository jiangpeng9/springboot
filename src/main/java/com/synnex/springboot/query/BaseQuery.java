package com.synnex.springboot.query;


public class BaseQuery {
    //easyui支持分页的属性
    private int page=1;
    private int rows=10;

    public BaseQuery(int page, int rows) {
        this.page = page;
        this.rows = rows;
    }

    public BaseQuery() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
