package com.cn.zl.repositroy;

import com.cn.zl.model.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * created by liangzhang212928
 * on 2019/11/18
 */
public interface CoffeeRepository extends BaseRepository<Coffee, Long> {
}
