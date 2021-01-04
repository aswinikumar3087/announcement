package com.mindtree.announcement.models.Response;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class Announcements {

    private String announcementTitle;
    private String announcementDescription;
    private String announceMentDate;

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getAnnouncementDescription() {
        return announcementDescription;
    }

    public void setAnnouncementDescription(String announcementDescription) {
        this.announcementDescription = announcementDescription;
    }

    public String getAnnounceMentDate() {
        return announceMentDate;
    }

    public void setAnnounceMentDate(String announceMentDate) {
        this.announceMentDate = announceMentDate;
    }
}
