package com.university.dto;

import lombok.Data;

import java.util.Map;

@Data
public class DepartmentStatisticsDto {

    String departmentTitle;

    Map<String, Integer> map;
}
