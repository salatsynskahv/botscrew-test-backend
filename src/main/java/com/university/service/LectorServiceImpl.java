package com.university.service;


import com.university.dto.LectorDto;
import com.university.entities.Degree;
import com.university.entities.Lector;
import com.university.repository.LectorRepository;
import com.university.util.LectorUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class LectorServiceImpl implements LectorService {


    private final LectorRepository lectorRepository;

    @Override
    public List<LectorDto> getAllLectors() {
        List<LectorDto> lectors = lectorRepository.findAll().stream().map(LectorUtil::toDto).toList();
        return lectors;
    }

    @Override
    public List<LectorDto> findLectorByQuery(String userQuery) {
        return lectorRepository.findByNameContainingIgnoreCase(userQuery)
                .stream().map(LectorUtil::toDto).toList();
    }

    @Override
    public LectorDto promoteLector(long lectorId) {
        Lector lector = lectorRepository.getById(lectorId);
        Degree nextDegree = Degree.getByValue(lector.getDegree().getValue() + 1);
        lector.setDegree(nextDegree);
        Lector lectorUpdated = lectorRepository.save(lector);
        return LectorUtil.toDto(lectorUpdated);
    }


    @Override
    public void updateName(long lectorId, String name) {
        Lector lector = lectorRepository.getById(lectorId);
        lector.setName(name);
        lectorRepository.save(lector);
    }
}
