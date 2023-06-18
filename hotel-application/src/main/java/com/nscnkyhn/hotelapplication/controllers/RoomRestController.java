package com.nscnkyhn.hotelapplication.controllers;

import com.nscnkyhn.hotelapplication.models.RoomModel;
import com.nscnkyhn.hotelapplication.services.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomModel> getAllRooms() {
        return this.roomService.getAllRooms();
    }
}
