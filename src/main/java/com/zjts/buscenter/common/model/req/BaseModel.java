package com.zjts.buscenter.common.model.req;

import java.io.Serializable;

public class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int currentPage;

    private int PageSize;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

}
