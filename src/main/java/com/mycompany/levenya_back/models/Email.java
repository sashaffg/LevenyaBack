/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levenya_back.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author sasha
 */
public class Email {
    @JsonProperty("email")
    public String email;
    @JsonProperty("name")
    public String name;

    public Email(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return email + "  " + name; 
    }
    
}
