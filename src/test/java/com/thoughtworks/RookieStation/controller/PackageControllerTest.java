package com.thoughtworks.RookieStation.controller;

import com.thoughtworks.RookieStation.entity.StationPackage;
import com.thoughtworks.RookieStation.service.PackageService;
import com.thoughtworks.RookieStation.service.PackageServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(SpringExtension.class)
class PackageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PackageServiceImpl packageService;

    private StationPackage initPackage() {
        StationPackage stationPackage = new StationPackage();
        stationPackage.setOrderId("123456789");
        stationPackage.setOwnerName("张女士");
        stationPackage.setPhoneNumber("88888888");
        stationPackage.setStatus(0);
        stationPackage.setAppointmentTime("201945555555");
        return stationPackage;
    }

    @Test
    void should_return_All_Packages_when_has_Packages() throws Exception {
        StationPackage stationPackage1 = initPackage();
        StationPackage stationPackage2 = initPackage();

        packageService.AddPackage(stationPackage1);
        packageService.AddPackage(stationPackage2);

        // ResultActions result = mockMvc.perform(delete("/parkinglots/{name}", "FirstParkingLot"));
        ResultActions resultActions = mockMvc.perform(get("/packages"));

        resultActions.andExpect(status().isOk());
    }

}