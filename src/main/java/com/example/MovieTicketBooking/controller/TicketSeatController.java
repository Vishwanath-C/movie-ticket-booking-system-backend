package com.example.MovieTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicketBooking.dto.TicketSeatDto;
import com.example.MovieTicketBooking.model.TicketSeat;
import com.example.MovieTicketBooking.service.TicketSeatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/ticketseats")
public class TicketSeatController {

    @Autowired
    TicketSeatService ticketSeatService;

    // @Autowired
    // TicketSeatDto ticketSeatDto;

    // @PostMapping("/create-ticket-seat")
    // public ResponseEntity<TicketSeat> postMethodName(@RequestBody TicketSeatDto ticketSeatDto) {

    //     return ResponseEntity.status(HttpStatus.CREATED).body(ticketSeatService.createTicketSeat(ticketSeatDto));
    // }

}
