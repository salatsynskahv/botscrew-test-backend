package com.university.util;

import com.university.dto.DepartmentDto;
import com.university.dto.DepartmentStatisticsDto;
import com.university.dto.LectorDto;
import com.university.entities.Department;
import com.university.entities.Lector;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentUtil {

    public static DepartmentDto toDto(Department entity){
        DepartmentDto dto = new DepartmentDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setLectors(entity.getLectors().stream()
                .map(lector -> new LectorDto(lector.getId(),
                        lector.getName(),
                        lector.getDegree().name(),
                        lector.getDegree().getValue(),
                        lector.getDepartments().stream().map(Department::getId).collect(Collectors.toSet()))
                ).collect(Collectors.toSet()));
        return dto;
    }

    public static Department fromDto(DepartmentDto dto){
        Department entity = new Department();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public static DepartmentStatisticsDto toDepartmentStatisticDto(Department department){
        DepartmentStatisticsDto departmentStatisticsDto = new DepartmentStatisticsDto();
        departmentStatisticsDto.setDepartmentTitle(department.getTitle());
        Map<String, Integer> countTitles = new HashMap();
        for(Lector lector: department.getLectors()){
            countTitles.putIfAbsent(String.valueOf(lector.getDegree()), 0);
            countTitles.computeIfPresent(String.valueOf(lector.getDegree()), (k, v) -> v+1);
        }
        departmentStatisticsDto.setMap(countTitles);
        return departmentStatisticsDto;
    }
}
