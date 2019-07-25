package com.thoughtworks.RookieStation.controller;

import com.thoughtworks.RookieStation.entity.StationPackage;
import com.thoughtworks.RookieStation.service.PackageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
public class PackageController {

    @Autowired
    private PackageServiceImpl packageService;

    @GetMapping
    public List<StationPackage> findAll() {
        return packageService.findAll();
    }

    @PostMapping
    public List<StationPackage> addPackage(@RequestBody StationPackage stationPackage){
        return packageService.AddPackage(stationPackage);
    }

    @PutMapping
    public List<StationPackage> update(@RequestBody StationPackage stationPackage){
        return packageService.UpdatePackage(stationPackage);
    }

    @GetMapping(params = "status")
    public List<StationPackage> sortByStatus(@RequestParam int status){
        return packageService.findAllByStatus(status);
    }

}
