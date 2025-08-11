package com.example.MovieTicketBooking.mapper;

import org.springframework.stereotype.Component;

import com.example.MovieTicketBooking.dto.responsedtos.TheatreResponseDto;
import com.example.MovieTicketBooking.model.Theatre;

@Component
public class TheatreResponseDtoMapper {
    public TheatreResponseDto theatreToDto(Theatre theatre){
        TheatreResponseDto theatreResponseDto = new TheatreResponseDto();

        theatreResponseDto.setId(theatre.getId());
        theatreResponseDto.setName(theatre.getName());
        theatreResponseDto.setLocation((theatre.getLocation()));

        return theatreResponseDto;
    }
}
