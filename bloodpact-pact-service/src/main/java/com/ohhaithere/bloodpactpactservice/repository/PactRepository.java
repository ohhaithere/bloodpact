package com.ohhaithere.bloodpactpactservice.repository;

import com.ohhaithere.bloodpactpactservice.model.Pact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PactRepository extends JpaRepository<Pact, UUID> {
}
