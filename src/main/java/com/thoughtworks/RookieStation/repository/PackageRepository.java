package com.thoughtworks.RookieStation.repository;

import com.thoughtworks.RookieStation.entity.StationPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PackageRepository extends JpaRepository<StationPackage, String> {
    List<StationPackage> findAllByStatus(int status);

}
