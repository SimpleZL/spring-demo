package com.cn.zl.repositroy;

import com.cn.zl.model.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * created by liangzhang212928
 * on 2019/11/18
 */
public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {

    List<CoffeeOrder> findByCustomerOrderById(String customer);
    List<CoffeeOrder> findByItems_Name(String name);
}
