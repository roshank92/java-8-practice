package com.company.problem1;

import java.time.ZonedDateTime;

public class Customer {

    private Long id;

    private String mobile;


    private String zipcode;

    private String firstName;

    private String lastName;

    private String city;

    private ZonedDateTime createdDate;



    public Customer(Long id, String mobile,  String zipcode,String firstName, String lastName, String city, ZonedDateTime createdDate) {
        this.id = id;
        this.mobile = mobile;
        this.zipcode = zipcode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
