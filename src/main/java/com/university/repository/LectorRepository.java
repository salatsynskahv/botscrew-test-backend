package com.university.repository;


import com.university.entities.Lector;
import com.university.exceptions.LectorWasNotFound;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectorRepository extends JpaRepository<Lector, Long> {

    List<Lector> findByNameContainingIgnoreCase(String query);

    default Lector getById(long id) {
        return findById(id).orElseThrow(() -> new LectorWasNotFound(String.format("User with id=%s is not found", id)));
    }
}
