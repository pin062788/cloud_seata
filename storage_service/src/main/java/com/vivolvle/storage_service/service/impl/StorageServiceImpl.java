package com.vivolvle.storage_service.service.impl;

import com.vivolvle.storage_service.entity.StorageTbl;
import com.vivolvle.storage_service.repositories.StorageRepository;
import com.vivolvle.storage_service.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageRepository storageRepository;

    @Override
    public StorageTbl update(String commodityCode, Integer count) {
        StorageTbl storageTbl = storageRepository.findByCommodityCode(commodityCode);
        storageTbl.setCount(storageTbl.getCount() - count);
        storageRepository.save(storageTbl);
        return storageTbl;
    }
}
