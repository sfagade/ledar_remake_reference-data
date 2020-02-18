package org.tsp.projects.ledar.referencedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tsp.projects.ledar.referencedata.model.GenderTypes;


/**
 *
 * @author sfagade
 */
@Repository
public interface GenderTypeRepository extends JpaRepository<GenderTypes, Long> {

}
