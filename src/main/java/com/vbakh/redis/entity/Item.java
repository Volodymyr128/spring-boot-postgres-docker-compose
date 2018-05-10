package com.vbakh.redis.entity;

import lombok.Data;
import javax.persistence.*;

/**
 * Created by volodymyr.bakhmatiuk on 5/9/18.
 */
@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ITEM_SEQUENCE")
    private Long id;

    @Column
    private String name;
}
