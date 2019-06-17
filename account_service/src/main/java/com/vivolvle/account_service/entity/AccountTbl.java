package com.vivolvle.account_service.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Entity
@Table(name = "account_tbl", schema = "seata")
public class AccountTbl {
    private int id;
    private String userId;
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
        AccountTbl that = (AccountTbl) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(money, that.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, money);
    }
}
