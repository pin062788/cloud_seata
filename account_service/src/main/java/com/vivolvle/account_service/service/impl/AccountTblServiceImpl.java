package com.vivolvle.account_service.service.impl;

import com.vivolvle.account_service.entity.AccountTbl;
import com.vivolvle.account_service.repositories.AccountTblRepository;
import com.vivolvle.account_service.service.AccountTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Service
public class AccountTblServiceImpl implements AccountTblService {
    @Autowired
    private AccountTblRepository accountTblRepository;

    @Override
    public AccountTbl insert(String userId, Integer money) {
        AccountTbl accountTbl = new AccountTbl();
        accountTbl.setUserId(userId);
        accountTbl.setMoney(money);
        accountTblRepository.save(accountTbl);
        return accountTbl;
    }

    @Override
    public String update(String userId, Integer money) {
        AccountTbl accountTbl = accountTblRepository.findAccountTblByUserId(userId);
        accountTbl.setMoney(accountTbl.getMoney() - money);
        accountTblRepository.save(accountTbl);
        return "success";
    }
}
