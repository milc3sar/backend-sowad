package com.example.backendsowad.controller;

import com.example.backendsowad.entity.Advertisement;
import com.example.backendsowad.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = {"localhost:4200"})
@RequestMapping(value = "/advertisement")
public class AdvertisementController {

    @Autowired
    private AdvertisementService dao;

    @GetMapping(value = {"/", ""})
    public ResponseEntity<List<Advertisement>> getAllAdvertisements() {
        return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public Advertisement getAdvertisement(@PathVariable Long id) {
        return dao.findById(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveAdvertisement(@RequestBody Advertisement adv){
        this.dao.save(adv);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}/delete")
    public ResponseEntity<?> deleteAdv(@PathVariable Long id) {
        this.dao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}