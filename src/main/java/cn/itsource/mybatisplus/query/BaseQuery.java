package cn.itsource.mybatisplus.query;

/**
 * @author solargen
 * @version V1.0
 * @className BaseQuery
 * @description TODO
 * @date 2019/5/13
 */
public class BaseQuery {

    private int page = 1;
    private int rows = 10;

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
