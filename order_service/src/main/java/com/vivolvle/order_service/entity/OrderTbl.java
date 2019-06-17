package com.vivolvle.order_service.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Entity
@Table(name = "order_tbl", schema = "seata")
public class OrderTbl {
    private int id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "commodity_code")
    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "money")
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTbl orderTbl = (OrderTbl) o;
        return id == orderTbl.id &&
                Objects.equals(userId, orderTbl.userId) &&
                Objects.equals(commodityCode, orderTbl.commodityCode) &&
                Objects.equals(count, orderTbl.count) &&
                Objects.equals(money, orderTbl.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, commodityCode, count, money);
    }
}
