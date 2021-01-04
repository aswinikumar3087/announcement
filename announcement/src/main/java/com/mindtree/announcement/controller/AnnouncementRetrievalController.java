package com.mindtree.announcement.controller;

import com.mindtree.announcement.constant.AnnouncementConstant;
import com.mindtree.announcement.models.Request.CreateAnnouncementRequest;
import com.mindtree.announcement.models.Response.AnnouncementResponse;
import com.mindtree.announcement.service.RetriveAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
@RestController
public class AnnouncementRetrievalController {

    @Autowired
    private RetriveAnnouncementService retriveAnnouncementService;

    @GetMapping(AnnouncementConstant.RETRIEVE_ANNOUNCEMENT_ENDPOINT)
    public ResponseEntity<AnnouncementResponse> retrieveAnnouncements(){
         AnnouncementResponse announcementResponse =  retriveAnnouncementService.retriveAnnouncements();
        return new ResponseEntity<>(announcementResponse, HttpStatus.OK);
    }
}
