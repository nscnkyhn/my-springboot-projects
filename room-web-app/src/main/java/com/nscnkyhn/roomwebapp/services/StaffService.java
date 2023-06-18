package com.nscnkyhn.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nscnkyhn.roomwebapp.models.StaffModel;
import com.nscnkyhn.roomwebapp.models.RoleModel;

@Service
public class StaffService {
    private static final List<StaffModel> staff = new ArrayList<>();

    static {
        staff.add(new StaffModel(1, UUID.randomUUID().toString(), "Enes Can", "Kayhan", RoleModel.IT.toString(), 25, true));
        staff.add(new StaffModel(2, UUID.randomUUID().toString(), "Doğukan", "Balcı", RoleModel.IT.toString(), 25, true));
        staff.add(new StaffModel(3, UUID.randomUUID().toString(), "Eren", "Aydaş", RoleModel.FRONT_DESK.toString(), 25, false));
        staff.add(new StaffModel(4, UUID.randomUUID().toString(), "Sema", "Şahin", RoleModel.SECRETARY.toString(), 28, true));
        staff.add(new StaffModel(5, UUID.randomUUID().toString(), "Melis", "Şensoy", RoleModel.MANAGEMENT.toString(), 24, false));
        staff.add(new StaffModel(6, UUID.randomUUID().toString(), "Berna", "Uzun", RoleModel.CUSTOMER_SERVICES.toString(), 42, true));
        staff.add(new StaffModel(7, UUID.randomUUID().toString(), "Mert", "Gündüz", RoleModel.CONCIERGE.toString(), 25, true));
    }

    public List<StaffModel> getAllStaffs() {
        return staff;
    }
}
