package com.nscnkyhn.hotelApplication.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nscnkyhn.hotelApplication.models.RoomModel;
import com.nscnkyhn.hotelApplication.services.RoomService;

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
