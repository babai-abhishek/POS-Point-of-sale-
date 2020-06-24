package com.example.customer.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "mobile_no")
    String mobile_no;

    @Column(name = "address")
    String address;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private CustomerSale sale;


    public Customer() {
        super();
    }

    public CustomerSale getSale() {
        return sale;
    }

    public void setSale(CustomerSale sale) {
        this.sale = sale;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}