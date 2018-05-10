package com.vbakh.redis.rest;

import com.vbakh.redis.entity.Item;
import com.vbakh.redis.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/9/18.
 */
@RestController
@RequestMapping("item")
public class MainController {

    @Resource
    private ItemService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return service.getAll();
    }
}