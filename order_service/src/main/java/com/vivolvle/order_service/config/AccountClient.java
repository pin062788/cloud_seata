package com.vivolvle.order_service.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author weilz
 * @date 2019/6/17
 */
@FeignClient(name = "account-service")
public interface AccountClient {
    @PostMapping("/account/update")
    String update(@RequestParam("userId") String userId
            , @RequestParam("money") Integer money, @RequestParam("onlyValue") String onlyValue);
}
