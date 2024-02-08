package com.university.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "lector")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Lector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="degree")
    private Degree degree;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "lector_department",
            joinColumns = {
                    @JoinColumn(name = "lector_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "department_id", referencedColumnName = "id")
            }
    )
    @JsonManagedReference
    private Set<Department> departments;

}
