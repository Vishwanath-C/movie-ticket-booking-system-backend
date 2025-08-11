package com.example.MovieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicketBooking.dto.SeatTypeRequest;
import com.example.MovieTicketBooking.model.Seat;
import com.example.MovieTicketBooking.model.Theatre;
import com.example.MovieTicketBooking.model.enums.SeatType;
import com.example.MovieTicketBooking.service.SeatService;
import com.example.MovieTicketBooking.service.TheatreService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    SeatService seatService;

    @Autowired
    TheatreService theatreService;

    @GetMapping("/theatre/{theatre-id}")
    public List<Seat> getSeatsByTheatre(@PathVariable Long theatreId) {
        return seatService.getAllSeatsInATheatre(theatreId);
    }

    @PostMapping("/generate_seats/theatres/{theatreId}")
    public ResponseEntity<Void> createSeat(@RequestBody List<SeatTypeRequest> seatTypeRequests,
            @PathVariable Long theatreId) {
        Theatre theatre = theatreService.getTheatreById(theatreId);
        seatService.generateSeats(theatre, seatTypeRequests);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-seat-types")
    public ResponseEntity<SeatType[]> getSeatTypes() {
        return ResponseEntity.ok().body(SeatType.values());
    }
    

}
