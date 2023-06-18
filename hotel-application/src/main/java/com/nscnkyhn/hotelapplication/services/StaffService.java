package com.nscnkyhn.hotelapplication.services;

import com.nscnkyhn.hotelapplication.models.StaffModel;
import com.nscnkyhn.hotelapplication.models.StaffRoleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    private static final List<StaffModel> staffs = new ArrayList();

    static {
        staffs.add(new StaffModel(1, StaffRoleModel.MANAGEMENT.toString(), "Enes Can", "Kayhan", "asdf123@gmail.com", 25, "Male", "Active"));
        staffs.add(new StaffModel(2, StaffRoleModel.TECHNIC.toString(), "Doğukan", "Balcı", "qwer123@gmail.com", 25, "Male", "Active"));
        staffs.add(new StaffModel(3, StaffRoleModel.SECRETARY.toString(), "Sema", "Şahin", "zxcv123@gmail.com", 28, "Female", "Active"));
    }

    public List<StaffModel> getAllStaffInfo() {
        return staffs;
    }
}
