package com.university.service;

import com.university.dto.LectorDto;
import com.university.entities.Lector;

import java.util.List;


public interface LectorService {

    List<LectorDto> getAllLectors();

    List<LectorDto> findLectorByQuery(String userQuery);

    LectorDto promoteLector(long lectorId);

    void updateName(long lectorId, String name);
}
