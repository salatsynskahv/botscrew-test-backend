package com.university.controller;

import com.university.dto.DepartmentDto;
import com.university.dto.DepartmentStatisticsDto;
import com.university.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "${app.cors.allowed-origins}", maxAge = 3600)
@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;


    @GetMapping("/all")
    public List<DepartmentDto> test() {
        return departmentService.getAllDepartments();
    }


    @GetMapping("/{departmentId}/statistics")
    public DepartmentStatisticsDto getDepartmentStatistics(@PathVariable("departmentId") Long departmentId) {
        return departmentService.getDepartmentStatics(departmentId);
    }

}
