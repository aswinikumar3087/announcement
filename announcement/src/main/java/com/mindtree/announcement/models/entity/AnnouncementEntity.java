/**
 * (C) Koninklijke Philips Electronics N.V. 2019
 * <p>
 * All rights are reserved. Reproduction or transmission in whole or in part,
 * in  any form or by any means, electronic, mechanical or otherwise, is
 * prohibited without the prior written permission of the copyright owner.
 *
 * @author Aswini Kumar Parida
 * <p>
 * Filename   : AnnouncementEntity.java
 * <p>
 * Description : The class AnnouncementEntity.java.
 * @version 1.0
 */
package com.mindtree.announcement.models.entity;


import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;


/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementEntity {

    @Id
    private Integer id;
    @Column(name = "announcementtitle")
    private String announcementTitle;

    @Column(name = "announcementdesc")
    private String announcementDesc;

    @Column(name = "announcementdate")
    private Timestamp announcementDate;

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getAnnouncementDesc() {
        return announcementDesc;
    }

    public void setAnnouncementDesc(String announcementDesc) {
        this.announcementDesc = announcementDesc;
    }

    public Timestamp getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(Timestamp announcementDate) {
        this.announcementDate = announcementDate;
    }
}
