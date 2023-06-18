package com.nscnkyhn.hotelapplication.controllers;

import com.nscnkyhn.hotelapplication.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffInfo(Model model) {
        model.addAttribute("staffs", staffService.getAllStaffInfo());
        return "staffs";
    }
}
