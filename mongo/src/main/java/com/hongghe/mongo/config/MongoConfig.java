package com.hongghe.mongo.config;


import com.mongodb.client.model.geojson.Polygon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The configuration of mongo.
 *
 * @author hongghe 19/07/2018
 */
@Component
public class MongoConfig {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Polygon polygon){
        mongoTemplate.save(polygon);
    }

//    public void saveRegions(List<GisRegion> gisRegionList){
//        mongoTemplate.insert(gisRegionList,GisRegion.xclass);
//    }

    public <T> T findById(Class<T> entityClass, String id) {
        return mongoTemplate.findById(id, entityClass);
    }

    public <T> List<T> findAll(Class<T> entityClass) {
        return mongoTemplate.findAll(entityClass);
    }

    public <T> void remove(T entity) {
        mongoTemplate.remove(entity);
    }

    public <T> void add(T entity) {
        mongoTemplate.insert(entity);
    }

    public <T> void addAll(List<T> entity) {
        mongoTemplate.insertAll(entity);
    }

    public <T> void saveOrUpdate(T entity) {
        mongoTemplate.save(entity);
    }

    public <T> T findOne(Class<T> entityClass) {
        return mongoTemplate.findOne(new Query(), entityClass);
    }

    public List<Polygon> findIntersective(GeoJson geoJson){
        Query query=new Query(Criteria.where("geometry").intersects(geoJson));
        List<Polygon> list=mongoTemplate.find(query,Polygon.class);
        return list;
    }

//    public boolean isExistIntersective(GeoJson geoJson){
//        Query query=new Query(Criteria.where("geometry").intersects(geoJson).and("_id").is(100000));
//        boolean res=mongoTemplate.exists(query,GisRegion.class);
//        return res;
//    }
}
