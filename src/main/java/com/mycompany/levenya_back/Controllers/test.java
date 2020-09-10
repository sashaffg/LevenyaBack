/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levenya_back.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sasha
 */
@RestController
@RequestMapping("")
public class test {

    @GetMapping
    public String showStatus() {
        return "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<title></title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<H1>HELLO</H1>\n"
                + "</body>\n"
                + "</html>";
    }
}
