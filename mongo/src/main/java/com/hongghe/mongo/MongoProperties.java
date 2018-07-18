package com.hongghe.mongo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Read the properties of the .yml file properties.
 *
 * @author hongghe 18/07/2018
 */
@ConfigurationProperties("mongodemo")
public class MongoProperties {
    private MongoProperties mongoProperties = new MongoProperties();
}
