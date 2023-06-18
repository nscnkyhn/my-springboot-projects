package com.nscnkyhn.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nscnkyhn.roomwebapp.models.RoomModel;

@Service
public class RoomService {
    private static final List<RoomModel> room = new ArrayList<>();

    static {
        room.add(new RoomModel(1, UUID.randomUUID().toString(), "Room Atlas", "Occupied"));
        room.add(new RoomModel(2, UUID.randomUUID().toString(), "Room Beta", "Free"));
        room.add(new RoomModel(3, UUID.randomUUID().toString(), "Room Gamora", "Occupied"));
        room.add(new RoomModel(4, UUID.randomUUID().toString(), "Room Phoenix", "Occupied"));
        room.add(new RoomModel(5, UUID.randomUUID().toString(), "Room Zeus", "Free"));
        room.add(new RoomModel(6, UUID.randomUUID().toString(), "Room Aurora", "Free"));
        room.add(new RoomModel(7, UUID.randomUUID().toString(), "Room Orvhorius", "Occupied"));
    }

    public List<RoomModel> getAllRooms() {
        return room;
    }
}
