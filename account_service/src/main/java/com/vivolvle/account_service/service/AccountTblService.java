package com.vivolvle.account_service.service;

import com.vivolvle.account_service.entity.AccountTbl;

/**
 * @author weilz
 * @date 2019/6/17
 */
public interface AccountTblService {
    AccountTbl insert(String userId, Integer money);
    String update(String userId, Integer money);
}
