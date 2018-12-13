package com.assessment.Motel666.Repository;

import com.assessment.Motel666.Entity.Motel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MotelRepository extends CrudRepository<Motel, Long> {

    @Query(value = "SELECT i.id, i.user_id, i.type, i.timestamp, i.context from  Motel i where i.user_id=:userId", nativeQuery = true)
    Iterable<Motel> findByuserId(String userId);
}
