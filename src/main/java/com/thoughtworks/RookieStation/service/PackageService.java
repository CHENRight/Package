package com.thoughtworks.RookieStation.service;

import com.thoughtworks.RookieStation.entity.StationPackage;

import java.util.List;

public interface PackageService {
    List<StationPackage> findAllByStatus(int status);
}
