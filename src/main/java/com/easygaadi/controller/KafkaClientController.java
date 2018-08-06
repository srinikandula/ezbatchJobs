package com.easygaadi.controller;

import com.easygaadi.service.SchedulerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/api/v1/")
public class KafkaClientController {
    private static final Logger logger = LoggerFactory.getLogger(KafkaClientController.class);

    @Autowired
    private SchedulerService schedulerService;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "schedule/archiveDevicePositions", method = RequestMethod.GET)
    public String checkPendingForms(HttpServletRequest request) throws ParseException {
        logger.info("Checking pending documents");
        return "hello";
    }


    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "schedule/SchedulerService", method = RequestMethod.GET)
    public String SchedulerService(HttpServletRequest request) throws ParseException {
        schedulerService.updateGeofenceReport();
        logger.info("Checking pending documents");
        return "hello";
    }
}
