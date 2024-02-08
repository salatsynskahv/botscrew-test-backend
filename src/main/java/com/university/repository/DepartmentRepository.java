package com.university.repository;


import com.university.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findAllByOrderByIdAsc();


//    @Query("select title, degree, count(lector_id)" +
//            "from" +
//            "    department d inner join lector_department ld on d.id = ld.department_id" +
//            "    inner join lector l on  ld.lector_id = l.id" +
//            "group by title, degree" +
//            "order by title")
//    List<Object[]> countLectorsByDepartmentAndDegree();

}
