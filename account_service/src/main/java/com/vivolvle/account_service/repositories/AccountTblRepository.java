package com.vivolvle.account_service.repositories;

import com.vivolvle.account_service.entity.AccountTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Component
public interface AccountTblRepository extends JpaRepository<AccountTbl, Object> {
    AccountTbl findAccountTblByUserId(String userId);
}
