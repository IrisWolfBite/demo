package com.zjf.model;

import lombok.Data;

/**
 * className:Num
 * package:com.zjf.mapper
 * Description:简单描述
 *
 * @date: 2019/9/19 11:54
 * @Author: ASUS
 */
@Data
public class Num {
    private String name;
    private Integer money;

    public String getName() {
        return name;
    }

    public Num setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public Num setMoney(Integer money) {
        this.money = money;
        return this;
    }
}
