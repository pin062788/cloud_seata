package com.vivolvle.account_service.controller;

import com.vivolvle.account_service.entity.AccountTbl;
import com.vivolvle.account_service.service.AccountTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author weilz
 * @date 2019/6/17
 */
@RestController
@RequestMapping("/account")
public class AccountTblController {
    @Autowired
    private AccountTblService accountTblService;

    @GetMapping("/insert")
    public AccountTbl insert(@RequestParam("userId") String userId, @RequestParam("money") Integer money) {
        return accountTblService.insert(userId, money);
    }

    @PostMapping("/update")
    public String update(@RequestParam("userId") String userId, @RequestParam("money") Integer money) {
        return accountTblService.update(userId, money);
    }

}
