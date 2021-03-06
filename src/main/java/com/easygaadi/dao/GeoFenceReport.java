package com.easygaadi.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "gpsFencesReports")
public final class GeoFenceReport extends AbstractDocument {
    private String deviceId;
    private String registrationNo;
    private String depot;
    private Date startTime;
    private Date endTime;
    private String accountId;
    public GeoFenceReport(String accountId, String deviceId, String registrationNo, String depot, Date start, Date end) {
        this.setAccountId(accountId);
        this.deviceId = deviceId;
        this.registrationNo = registrationNo;
        this.depot = depot;
        this.startTime = start;
        this.endTime = end;
    }
}
