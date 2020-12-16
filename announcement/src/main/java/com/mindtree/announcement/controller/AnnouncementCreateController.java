/**
 * (C) Koninklijke Philips Electronics N.V. 2019
 * <p>
 * All rights are reserved. Reproduction or transmission in whole or in part,
 * in  any form or by any means, electronic, mechanical or otherwise, is
 * prohibited without the prior written permission of the copyright owner.
 *
 * @author Aswini Kumar Parida
 * <p>
 * Filename   : AnnouncementCreateController.java
 * <p>
 * Description : The class AnnouncementCreateController.java.
 * @version 1.0
 */
package com.mindtree.announcement.controller;

import com.mindtree.announcement.constant.AnnouncementConstant;
import com.mindtree.announcement.models.Request.CreateAnnouncementRequest;
import com.mindtree.announcement.service.AnnouncementCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementCreateController {

    @Autowired
    private AnnouncementCreationService announcementCreationService;

    @PostMapping(AnnouncementConstant.CREATE_ANNOUNCEMENT_ENDPOINT)
    public ResponseEntity<Void> createAnnouncements(@Valid @RequestBody CreateAnnouncementRequest createAnnouncementRequest){

        announcementCreationService.createAnnouncement(createAnnouncementRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
