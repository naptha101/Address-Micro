package com.example.Address;

import com.example.Address.entity.AddressEntity;
import com.example.Address.response.AddressResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface AddressRepo extends JpaRepository<AddressEntity,Integer> {

    @Query(nativeQuery = true,value="select a.lane1, a.emplo_id, a.lane2, a.lane3, a.zip, a.id from emp_micro.address a inner join emp_micro.employees e on a.emplo_id = e.employee_id where a.emplo_id =:employerId   ; ")
    AddressEntity findAddressofEmployee(@Param("employerId") int employerId);
}
