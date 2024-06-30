package com.example.cources.repo;

import com.example.cources.entity.cources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface courceRepo extends JpaRepository<cources,Integer> {
    @Query(nativeQuery = true,value="select a.id, a.emp_id, a.cname, a.teacher from emp_micro.cources a inner join emp_micro.employees e on a.emp_id = e.employee_id where a.emp_id =:employerId   ; ")
    cources findCourcefEmployee(@Param("employerId") int employerId);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value="insert into  emp_micro.cources values( :id , :cname, :teacher , :emp_id );")
 void postCource(@Param("id") int id,@Param("cname") String cname,@Param("teacher") String teacher,@Param("emp_id") int employerId);

}
