package com.university.service;

import com.university.dto.DepartmentDto;
import com.university.dto.DepartmentStatisticsDto;
import com.university.entities.Department;
import com.university.repository.DepartmentRepository;
import com.university.util.DepartmentUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDto> getAllDepartments() {
        List<Department> departments = departmentRepository.findAllByOrderByIdAsc();
        List<DepartmentDto> dtos = departments.stream().map(DepartmentUtil::toDto).toList();
        return dtos;
    }

    @Override
    public DepartmentStatisticsDto getDepartmentStatics(Long id) {
//        List<Object[]> res = departmentRepository.countLectorsByDepartmentAndDegree();
        DepartmentStatisticsDto statisticsDto =
                DepartmentUtil.toDepartmentStatisticDto(departmentRepository.findById(id).get());

        return statisticsDto;
    }


}
