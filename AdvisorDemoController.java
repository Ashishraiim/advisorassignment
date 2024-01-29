package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/advisor")
public class AdvisorDemoController {

    @PostMapping("/")
    public ResponseEntity<Void> addAdvisor(@RequestBody AdvisorRequestDetails advisor) {
        
        if (advisor.getName() == null || advisor.getPhotoUrl() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
