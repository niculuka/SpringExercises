package com.example.SpringExercises.ex6_onConstructor;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

//@Component
@ConstructorBinding

@Slf4j
@Validated
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
public class PersonPropOnConstructor implements CommandLineRunner {
    @NotNull(message = "email cannot be null")
    @Email(message = "incorrect email format")
    private String email;

    private String firstName;

    @NotNull(message = "last name has to be provided")
    @Length(min = 3, max = 20)
    private String lastName;

    private String address;

    @NotNull(message = "age is mandatory")
    @Min(value = 18)
    private Integer age;

    @NotEmpty(message = "values cannot be empty")
    private List<String> values;

    @NotEmpty(message = "custom attributes cannot be empty")
    private Map<String, String> customAttributes;



    @AssertTrue(message = "address is invalid")
    public boolean isAddressValid() {
        return address != null && address.split(" ").length == 2;
    }


    public PersonPropOnConstructor(
            String email,
            String firstName,
            String lastName,
            String address,
            Integer age,
            List<String> values,
            Map<String, String> customAttributes
    ) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.values = values;
        this.customAttributes = customAttributes;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("PersonPropOnConstructor{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", values=" + values +
                ", customAttributes=" + customAttributes +
                '}');
    }


//    public String getEmail() {
//        return email;
//    }
//
//    public PersonPropOnConstructor setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public PersonPropOnConstructor setFirstName(String firstName) {
//        this.firstName = firstName;
//        return this;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public PersonPropOnConstructor setLastName(String lastName) {
//        this.lastName = lastName;
//        return this;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public PersonPropOnConstructor setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public PersonPropOnConstructor setAge(Integer age) {
//        this.age = age;
//        return this;
//    }
//
//    public List<String> getValues() {
//        return values;
//    }
//
//    public PersonPropOnConstructor setValues(List<String> values) {
//        this.values = values;
//        return this;
//    }
//
//    public Map<String, String> getCustomAttributes() {
//        return customAttributes;
//    }
//
//    public PersonPropOnConstructor setCustomAttributes(Map<String, String> customAttributes) {
//        this.customAttributes = customAttributes;
//        return this;
//    }
}


