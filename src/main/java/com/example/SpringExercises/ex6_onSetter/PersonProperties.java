package com.example.SpringExercises.ex6_onSetter;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
@Validated
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
public class PersonProperties implements CommandLineRunner {
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



    @Override
    public void run(String... args) throws Exception {
        log.info("PersonProperties{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", values=" + values +
                ", customAttributes=" + customAttributes +
                '}');
    }

    public String getEmail() {
        return email;
    }

    public PersonProperties setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonProperties setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonProperties setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonProperties setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public PersonProperties setAge(Integer age) {
        this.age = age;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public PersonProperties setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public Map<String, String> getCustomAttributes() {
        return customAttributes;
    }

    public PersonProperties setCustomAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }
}


