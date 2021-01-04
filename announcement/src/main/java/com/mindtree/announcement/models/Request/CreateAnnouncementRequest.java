package com.mindtree.announcement.models.Request;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class CreateAnnouncementRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "Announcement title cannot be empty.")
    private String announcementTitle;
    @NotEmpty(message = "Announcement Description cancnot be empty.")
    private String announcementDescription;
    @NotEmpty(message = "Announcement date cannot be empty.")
    private String announcementDate;

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

    public String getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(String announcementDate) {
        this.announcementDate = announcementDate;
    }

    @Override
    public String toString() {
        return "CreateAnnouncementRequest{" +
                "announcementTitle='" + announcementTitle + '\'' +
                ", announcementDescription='" + announcementDescription + '\'' +
                ", announceMentDate='" + announcementDate + '\'' +
                '}';
    }
}
