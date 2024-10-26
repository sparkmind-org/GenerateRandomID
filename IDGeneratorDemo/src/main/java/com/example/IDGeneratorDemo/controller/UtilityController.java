package com.example.IDGeneratorDemo.controller;

import com.example.IDGeneratorDemo.entity.Utility;
import com.example.IDGeneratorDemo.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ID")
public class UtilityController {

    @Autowired
    private UtilityService utilityService;

    @PostMapping
    public Utility createUtility(@RequestBody Utility utility) {
        // Pass the name and age from the request body to the service method
        return utilityService.createUtility(utility.getName(), utility.getAge());
    }
}
