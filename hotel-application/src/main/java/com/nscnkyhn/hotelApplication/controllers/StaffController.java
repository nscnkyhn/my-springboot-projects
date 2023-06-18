package com.nscnkyhn.hotelApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nscnkyhn.hotelApplication.services.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffs(Model model) {
        model.addAttribute("staffs", staffService.getAllStaffs());
        return "staff";
    }
}
