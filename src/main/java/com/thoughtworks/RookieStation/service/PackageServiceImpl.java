package com.thoughtworks.RookieStation.service;

import com.thoughtworks.RookieStation.entity.StationPackage;
import com.thoughtworks.RookieStation.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageRepository packageRepository;

    public List<StationPackage> findAll() {
        return packageRepository.findAll();
    }

    public StationPackage fingByOrderId(String OrderId) {
        return packageRepository.findById(OrderId).get();
    }

    public List<StationPackage> AddPackage(StationPackage stationPackage) {
        packageRepository.save(stationPackage);
        return packageRepository.findAll();
    }

    //controller是要传入一个id指定包裹，进行更新
    public List<StationPackage> UpdatePackage(StationPackage stationPackage) {
         packageRepository.save(stationPackage);
         return packageRepository.findAll();
    }

    @Override
    public List<StationPackage> findAllByStatus(int status) {
        return packageRepository.findAllByStatus(status);
    }

    //按照条件过滤包裹，根据status拿包裹
//    public List<StationPackage> filterPackage(int status) {
//        return packageRepository.findAllByStatus(status);
//    }

    //预约后更新包裹状态与时间


    //标记为确认取件，修改包裹取件时间

}
