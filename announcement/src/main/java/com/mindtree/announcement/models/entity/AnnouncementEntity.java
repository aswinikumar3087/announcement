package com.mindtree.announcement.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
@Entity
@Table(name = "announcement", schema = "announcement")
public class AnnouncementEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "announcementtitle")
    private String announcementTitle;

    @Column(name = "announcementdesc")
    private String announcementDesc;

    @Column(name = "announcementdate")
    private String announcementDate;

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

    public String getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(String announcementDate) {
        this.announcementDate = announcementDate;
    }
}
