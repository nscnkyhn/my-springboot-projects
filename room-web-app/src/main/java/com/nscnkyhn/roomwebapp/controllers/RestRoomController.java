package com.nscnkyhn.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nscnkyhn.roomwebapp.models.RoomModel;
import com.nscnkyhn.roomwebapp.services.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RestRoomController {

    private final RoomService roomService;

    public RestRoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomModel> getAllRooms() {
        return roomService.getAllRooms();
    }
}
