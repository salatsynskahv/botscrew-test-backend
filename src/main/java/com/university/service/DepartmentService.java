package com.university.service;

import com.university.dto.DepartmentDto;
import com.university.dto.DepartmentStatisticsDto;
import com.university.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<DepartmentDto> getAllDepartments();

    DepartmentStatisticsDto getDepartmentStatics(Long id);
}
