package com.example.backendsowad.controller;

import com.example.backendsowad.entity.Organization;
import com.example.backendsowad.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping
    public ResponseEntity<?> getOrganizations() {
        return ResponseEntity.ok(organizationService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrganizationById(@PathVariable Long id) {
        return ResponseEntity.ok(organizationService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveOrganization(@RequestBody Organization organization) {
        organizationService.save(organization);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrganization(@PathVariable Long id) {
        organizationService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
