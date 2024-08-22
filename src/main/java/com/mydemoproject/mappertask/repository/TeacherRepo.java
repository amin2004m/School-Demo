package com.mydemoproject.mappertask.repository;

import com.mydemoproject.mappertask.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long>{
}
