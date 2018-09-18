package com.easygaadi.dao;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface GeoFenceReportRepository extends CrudRepository<GeoFenceReport, String> {
    List<GeoFenceReport> findByAccountId(String accountId);
    List<GeoFenceReport> findByAccountIdAndEndTime(ObjectId accountId, Date endTime);
}
