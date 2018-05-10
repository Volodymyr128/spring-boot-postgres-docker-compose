package com.vbakh.redis.service;

import com.vbakh.redis.entity.Item;
import com.vbakh.redis.repository.ItemRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/9/18.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemRepository repository;

    @Override
    public List<Item> getAll() {
        return repository.findAll();
    }
}
