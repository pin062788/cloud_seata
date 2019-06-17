package com.vivolvle.storage_service.repositories;

import com.vivolvle.storage_service.entity.StorageTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Component
public interface StorageRepository extends JpaRepository<StorageTbl, Object> {
    StorageTbl findByCommodityCode(String commodityCode);
}
