package com.university.util;

import com.university.dto.DepartmentDto;
import com.university.dto.LectorDto;
import com.university.entities.Department;
import com.university.entities.Lector;
import org.springframework.beans.BeanUtils;

import java.util.stream.Collectors;

public class LectorUtil {

    public static LectorDto toDto(Lector entity){
        LectorDto dto = new LectorDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDegree(entity.getDegree().name());
        dto.setDegreeId(entity.getDegree().getValue());
        dto.setDepartmentIds(entity.getDepartments().stream().map(Department::getId).collect(Collectors.toSet()));
        return dto;
    }

}
