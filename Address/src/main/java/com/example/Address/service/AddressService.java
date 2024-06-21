package com.example.Address.service;

import com.example.Address.AddressRepo;
import com.example.Address.entity.AddressEntity;
import com.example.Address.response.AddressResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo repo;

    public AddressResponse getAddress(int EmployerId){
        AddressEntity e=repo.findAddressofEmployee(EmployerId);
        AddressResponse r=new AddressResponse();
        System.out.println(e.getEmployee_id());
          BeanUtils.copyProperties(e,r);

        return r;
    }
}
