package com.example.Address.controller;

import com.example.Address.response.AddressResponse;
import com.example.Address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    AddressService ser;

    @GetMapping("/getadd/{empid}")
    public ResponseEntity<AddressResponse> getAddress(@PathVariable("empid") int empid){
      AddressResponse r=ser.getAddress(empid);
        return ResponseEntity.status(HttpStatus.OK).body(r);
    }

    @PostMapping("/add")
    public ResponseEntity<AddressResponse> setAddress(@RequestBody AddressResponse res){
        ser.setAddress(res);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

}
