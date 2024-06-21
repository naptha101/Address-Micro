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
    public void setAddress(AddressResponse res){
        AddressEntity e = new AddressEntity();
        e.setId(res.getId());
        e.setEmployee_id(res.getEmployee_id());
        e.setLane1(res.getLane1());
        e.setZip(res.getZip());
        e.setLane2(res.getLane2());
        e.setLane3(res.getLane3());
        System.out.println(e.getId()+" "+e.getEmployee_id()+" "+e.getLane1()+" "+e.getLane3()+" "+e.getLane1());
        repo.putAddress(e.getEmployee_id(),e.getLane1(),e.getLane2(),e.getLane3(), e.getZip(),e.getId());
    }

}
