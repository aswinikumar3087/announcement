/**
 * (C) Koninklijke Philips Electronics N.V. 2019
 * <p>
 * All rights are reserved. Reproduction or transmission in whole or in part,
 * in  any form or by any means, electronic, mechanical or otherwise, is
 * prohibited without the prior written permission of the copyright owner.
 *
 * @author Aswini Kumar Parida
 * <p>
 * Filename   : AnnouncementRetrievalController.java
 * <p>
 * Description : The class AnnouncementRetrievalController.java.
 * @version 1.0
 */
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

import javax.validation.Valid;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementRetrievalController {

    @Autowired
    private RetriveAnnouncementService retriveAnnouncementService;

    @GetMapping(AnnouncementConstant.RETRIEVE_ANNOUNCEMENT_ENDPOINT)
    public ResponseEntity<AnnouncementResponse> retrieveAnnouncements(){
         AnnouncementResponse announcementResponse =  retriveAnnouncementService.retriveAnnouncements();
        return new ResponseEntity<>(announcementResponse, HttpStatus.CREATED);
    }
}
