package src.main.java.com.crud.model;

//package com.vendor;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor_schema")
public class vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendor_id;


    @Column(name="vendor_name")
    private String vendor_name ;


    @Column(name="vendor_email")
    private String vendor_email;



    @Column(name="vendor_pass")
    private String vendor_pass;


    /////////////////////////
    //
    //getter and setter
    ///
    //
    /////////////////////////

    public long getvendor_id()
    {
        return vendor_id;
    }

    public void setvendor_id()
    {
        this.vendor_id=vendor_id;
    }


    public String getvendor_name()
    {
        return vendor_name;
    }

    public String setvendor_name()
    {
        this.vendor_name=vendor_name;
    }

    public String getvendor_email()
    {
        return vendor_email;
    }

    public void setvendor_pass()
    {
        this.vendor_pass=vendor_pass;
    }
    //constructor using fields

    public vendor(long vendor_id, String vandor_name, String vendor_email, String vendor_pass )
    {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_email = vendor_email;
        this.vendor_pass = vendor_pass;

    }

    public vendor()
    {

    }
        //@Override
        public String toString()
        {
                return "vendor[vendor_id="+vendor_id+",vendor_name="+vendor_name+",vendor_email"+vendor_email+",vendor_pass="+vendor_pass+"]";
        }


}