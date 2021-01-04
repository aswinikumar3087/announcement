package com.mindtree.announcement.models.Response;

import java.util.List;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementResponse {

    private List<Announcements> announcementList;
    private long totalNumberOfRecords;

    private int pageNumber;

    public List<Announcements> getAnnouncementList() {
        return announcementList;
    }

    public void setAnnouncementList(List<Announcements> announcementList) {
        this.announcementList = announcementList;
    }

    public long getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    public void setTotalNumberOfRecords(long totalNumberOfRecords) {
        this.totalNumberOfRecords = totalNumberOfRecords;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
