package com.projects.lakeSide_hotel.controller;

import org.springframework.http.ResponseEntity;

public class BookedRoomController {
    public ResponseEntity<?> getAllBookedRooms() {
        return ResponseEntity.ok().build();
    }
}
