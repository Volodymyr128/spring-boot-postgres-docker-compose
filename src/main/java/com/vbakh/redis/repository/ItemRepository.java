package com.vbakh.redis.repository;

import com.vbakh.redis.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by volodymyr.bakhmatiuk on 5/9/18.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
