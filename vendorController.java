package src.main.java.com.crud.controller;

//package com.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.vendorRepository;

@RestController
@RequestMapping("/api")
public class vendorController {
    
    @Autowired
    vendorRepository vendorRepository;

    @PostMapping("/vendor")
    public String createNewVendor(@RequestBody Vendor vendor)
    {
        vendorRepository.save(vendor);
        return "Vendor data base is being created in db";
    }

    @GetMapping("/vendor")
    {
        public ResponseEntity<List<Employee>> getAllvendor()
        {
            List<vendor> empList = new ArrayList<>();
            vendorRepository.findAll().forEach(vendorlist::add);
            return new ResponseEntity<List<vendor>>(vendor,HttpStatus.OK);


        }
    }

    @GetMapping("/vendor/{vendor_id}")

        public ResponseEntity<vendor> get EmployeeById(@PathVariable long vendor_id) 
        { Optional <vendor> ven = vendorRepository.findById(vendor_id);
            if(ven.isPresent()) 
             {
            return new ResponseEntity<vendor>(ven.get(), HttpStatus. FOUND);
            }
        else
        {
           return new ResponseEntity<vendor>(HttpStatus.NOT_FOUND);
        }
        }



    @DeleteMapping("/vendor/{vendor_id}") 
    public String delete vendorBy vendorid (@PathVariable Long vendor_id) 
    {

        vendorRepository.deleteById(vendor_id);

        return "vendor Deleted Successfully";
    }

    DeleteMapping("/vendor")

    public String deleteAllEmployee() 
    { vendorRepository.deleteAll(); 
        return "vendor details deleted Successfully..";
    }