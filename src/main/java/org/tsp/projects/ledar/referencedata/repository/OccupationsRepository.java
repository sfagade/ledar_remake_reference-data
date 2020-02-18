/*
 * This interface is used for Occupations entity data access and write
 */
package org.tsp.projects.ledar.referencedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tsp.projects.ledar.referencedata.model.Occupation;

/**
 * @author sfagade
 */
@Repository
public interface OccupationsRepository extends JpaRepository<Occupation, Long> {

}
