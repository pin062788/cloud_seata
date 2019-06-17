package com.vivolvle.storage_service.controller;

import com.vivolvle.storage_service.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/6/17
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/update")
    public String update(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count) {
        storageService.update(commodityCode, count);
        return "success";
    }
}
