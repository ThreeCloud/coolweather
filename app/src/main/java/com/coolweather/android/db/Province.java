package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Cloud on 2018/2/14.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provincceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvincceCode() {
        return provincceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvincceCode(int provincceCode) {
        this.provincceCode = provincceCode;
    }

}
