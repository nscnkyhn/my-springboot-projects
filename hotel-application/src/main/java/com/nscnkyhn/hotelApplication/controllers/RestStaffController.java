package com.nscnkyhn.hotelApplication.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nscnkyhn.hotelApplication.models.StaffModel;
import com.nscnkyhn.hotelApplication.services.StaffService;

@RestController
@RequestMapping("/api/staffs")
public class RestStaffController {

    private final StaffService staffService;

    public RestStaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffModel> getAllStaffs() {
        return staffService.getAllStaffs();
    }
}
