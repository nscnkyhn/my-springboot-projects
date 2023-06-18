package com.nscnkyhn.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nscnkyhn.roomwebapp.models.StaffModel;
import com.nscnkyhn.roomwebapp.services.StaffService;

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
