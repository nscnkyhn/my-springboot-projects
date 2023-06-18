package com.nscnkyhn.hotelapplication.controllers;

import com.nscnkyhn.hotelapplication.models.StaffModel;
import com.nscnkyhn.hotelapplication.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }
    @GetMapping
    public List<StaffModel> getAllStaffInfo() {
        return this.staffService.getAllStaffInfo();
    }
}
