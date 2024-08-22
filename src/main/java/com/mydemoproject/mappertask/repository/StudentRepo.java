package com.mydemoproject.mappertask.repository;

import com.mydemoproject.mappertask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
