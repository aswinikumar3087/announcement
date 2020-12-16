package com.mindtree.announcement.repository;

import com.mindtree.announcement.models.entity.AnnouncementEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * @author Aswini Kumar Parida
 * @version 1.0
 * @since 12/14/2020
 */
public interface AnnouncementRepository extends PagingAndSortingRepository<AnnouncementEntity, Integer> {
}
