package com.vivolvle.storage_service.service;

import com.vivolvle.storage_service.entity.StorageTbl;

/**
 * @author weilz
 * @date 2019/6/17
 */
public interface StorageService {
    StorageTbl update(String commodityCode, Integer count);
}
