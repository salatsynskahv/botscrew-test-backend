package com.university.dto;

import com.university.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LectorDto {
    private Long id;
    private String name;
    private String degree;
    private int degreeId;
    private Set<Long> departmentIds;
}
