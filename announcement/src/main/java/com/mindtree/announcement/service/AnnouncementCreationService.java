package com.mindtree.announcement.service;

import com.mindtree.announcement.models.Request.CreateAnnouncementRequest;
import com.mindtree.announcement.models.entity.AnnouncementEntity;
import com.mindtree.announcement.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementCreationService {

    @Autowired
    private AnnouncementRepository announcementRepository;

    public void createAnnouncement(final CreateAnnouncementRequest createAnnouncementRequest){
        final AnnouncementEntity announcementEntity = new AnnouncementEntity();
        announcementEntity.setAnnouncementTitle(createAnnouncementRequest.getAnnouncementTitle());
        announcementEntity.setAnnouncementDesc(createAnnouncementRequest.getAnnouncementDescription());
        //announcementEntity.setAnnouncementDate(Timestamp.valueOf(createAnnouncementRequest.getAnnouncementDate()));
        announcementEntity.setAnnouncementDate(createAnnouncementRequest.getAnnouncementDate());
        announcementRepository.save(announcementEntity);
    }

}
