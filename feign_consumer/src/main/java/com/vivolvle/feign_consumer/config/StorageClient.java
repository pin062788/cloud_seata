package com.vivolvle.feign_consumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author weilz
 * @date 2019/6/17
 */
@FeignClient(name = "storage-service")
public interface StorageClient {
    @GetMapping("/storage/update")
    String update(@RequestParam("commodityCode") String commodityCode
            , @RequestParam("count") Integer count, @RequestParam("onlyValue") String onlyValue);
}
