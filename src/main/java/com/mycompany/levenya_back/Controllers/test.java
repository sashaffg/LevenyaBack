/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levenya_back.Controllers;

import com.mycompany.levenya_back.models.Email;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sasha
 */
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("")
public class test {

    @PostMapping("/test")
    public String showStatus(@RequestBody Email mail) {
            System.out.println(mail);
            String res = mail + "JOPA";
            System.out.println(res);
            return res;
        }

        @GetMapping("/test")
        public ResponseEntity<Map> GET
        
            () {
        Map<Object, Object> response = new HashMap<>();
            response.put("msg", "HUI");
            return ResponseEntity.ok(response);
        }
    }
