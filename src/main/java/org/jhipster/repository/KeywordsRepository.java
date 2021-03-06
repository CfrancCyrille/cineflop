package org.jhipster.repository;

import org.jhipster.domain.Keywords;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Keywords entity.
 */
@SuppressWarnings("unused")
@Repository
public interface KeywordsRepository extends JpaRepository<Keywords, Long> {

}
