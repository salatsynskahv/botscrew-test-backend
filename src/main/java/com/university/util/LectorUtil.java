package com.university.util;

import com.university.dto.DepartmentDto;
import com.university.dto.LectorDto;
import com.university.entities.Department;
import com.university.entities.Lector;
import org.springframework.beans.BeanUtils;

public class LectorUtil {

    public static LectorDto toDto(Lector entity){
        LectorDto dto = new LectorDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static Lector fromDto(LectorDto dto){
        Lector entity = new Lector();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }


}
