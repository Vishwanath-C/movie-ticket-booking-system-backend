package com.example.MovieTicketBooking.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.MovieTicketBooking.dto.requestdtos.TheatreRequestDto;
import com.example.MovieTicketBooking.model.Theatre;

@Component
public class TheatreRequestDtoMapper {
    public Theatre dtoToTheatre(TheatreRequestDto theatreRequestDto){
        Theatre theatre = new Theatre();
        theatre.setName(theatreRequestDto.getName());
        theatre.setLocation(theatreRequestDto.getLocation());
        theatre.setMovieAssignments(new ArrayList<>());
        theatre.setSeats(new ArrayList<>());

        return theatre;
    }
}
