package com.mindtree.announcement.service;

import com.mindtree.announcement.constant.AnnouncementConstant;
import com.mindtree.announcement.models.Response.AnnouncementResponse;
import com.mindtree.announcement.models.Response.Announcements;
import com.mindtree.announcement.models.entity.AnnouncementEntity;
import com.mindtree.announcement.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class RetriveAnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;
    public AnnouncementResponse retriveAnnouncements() {
        final Pageable pageable = createPageableObject();
        Page<AnnouncementEntity> pagedAnnouncementEntityList = announcementRepository.findAll(pageable);
        final AnnouncementResponse announcementResponse = new AnnouncementResponse();
        if (pagedAnnouncementEntityList.hasContent()) {
            final long totalNumberOfRecords = pagedAnnouncementEntityList.getTotalElements();

            final int currentPageNumber = pagedAnnouncementEntityList.getPageable().getPageNumber()
                                              + AnnouncementConstant.NUMERIC_ONE;


            final List<Announcements> announcementsList = new ArrayList<>();
            pagedAnnouncementEntityList.getContent().stream().forEach(announcementEntity ->
                    populateAnnounceMentResponseObject(announcementsList,announcementEntity));
            announcementResponse.setAnnouncementList(announcementsList);
            announcementResponse.setPageNumber(currentPageNumber);
            announcementResponse.setTotalNumberOfRecords(totalNumberOfRecords);
        }
        return announcementResponse;
    }

    private void populateAnnounceMentResponseObject(List<Announcements> announcementsList, AnnouncementEntity announcementEntity) {
        Announcements announcements = new Announcements();
        announcements.setAnnouncementTitle(announcementEntity.getAnnouncementTitle());
        announcements.setAnnouncementDescription(announcementEntity.getAnnouncementDesc());
        announcements.setAnnounceMentDate(announcementEntity.getAnnouncementDate().toString());
        announcementsList.add(announcements);
    }

    private Pageable createPageableObject(){
        return PageRequest.of(0, 20);
    }

}
