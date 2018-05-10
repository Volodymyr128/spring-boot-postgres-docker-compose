package com.vbakh.redis.service;

import com.vbakh.redis.entity.Item;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/9/18.
 */
public interface ItemService {

    List<Item> getAll();
}
