package com.vbakh.redis;

import com.vbakh.redis.entity.Item;
import com.vbakh.redis.repository.ItemRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by volodymyr.bakhmatiuk on 5/10/18.
 */
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = ItemRepository.class)
@EntityScan(basePackageClasses = Item.class)
public class Configuration {
}
