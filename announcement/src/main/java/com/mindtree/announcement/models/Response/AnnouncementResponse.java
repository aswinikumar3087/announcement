/**
 * (C) Koninklijke Philips Electronics N.V. 2019
 * <p>
 * All rights are reserved. Reproduction or transmission in whole or in part,
 * in  any form or by any means, electronic, mechanical or otherwise, is
 * prohibited without the prior written permission of the copyright owner.
 *
 * @author Aswini Kumar Parida
 * <p>
 * Filename   : AnnouncementResponse.java
 * <p>
 * Description : The class AnnouncementResponse.java.
 * @version 1.0
 */
package com.mindtree.announcement.models.Response;

import java.util.List;

/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public class AnnouncementResponse {

    private List<Announcements> list;
    private long totalNumberOfRecords;

    private int pageNumber;

    public List<Announcements> getList() {
        return list;
    }

    public void setList(List<Announcements> list) {
        this.list = list;
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
