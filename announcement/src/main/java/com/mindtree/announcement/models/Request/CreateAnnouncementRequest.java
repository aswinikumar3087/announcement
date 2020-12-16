/**
 * (C) Koninklijke Philips Electronics N.V. 2019
 * <p>
 * All rights are reserved. Reproduction or transmission in whole or in part,
 * in  any form or by any means, electronic, mechanical or otherwise, is
 * prohibited without the prior written permission of the copyright owner.
 *
 * @author Aswini Kumar Parida
 * <p>
 * Filename   : CreateAnnouncementRequest.java
 * <p>
 * Description : The class CreateAnnouncementRequest.java.
 * @version 1.0
 */
package com.mindtree.announcement.models.Request;

import java.io.Serializable;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class CreateAnnouncementRequest implements Serializable {
    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        return "CreateAnnouncementRequest{" +
                "announcementTitle='" + announcementTitle + '\'' +
                ", announcementDescription='" + announcementDescription + '\'' +
                ", announceMentDate='" + announceMentDate + '\'' +
                '}';
    }
}
