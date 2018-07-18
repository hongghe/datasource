package com.hongghe.mongo.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Mongo database properties.
 *
 * @author hongghe 18/07/2018
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class MongoPerperties {
    private final Long id;
    private String username;
    private String password;
}
