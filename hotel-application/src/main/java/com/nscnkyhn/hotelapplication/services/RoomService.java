package com.nscnkyhn.hotelapplication.services;

import com.nscnkyhn.hotelapplication.models.RoomModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<RoomModel> rooms = new ArrayList();

    static {
        rooms.add(new RoomModel(1, "Room Alpha", "Occupied"));
        rooms.add(new RoomModel(2, "Room Beta", "Available"));
        rooms.add(new RoomModel(3, "Room Gama", "Occupied"));
    }

    public List<RoomModel> getAllRooms() {
        return rooms;
    }
}
