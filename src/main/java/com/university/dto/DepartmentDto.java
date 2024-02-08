package com.university.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.university.entities.Lector;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;
    private String title;
    private Set<LectorDto> lectors;
}
