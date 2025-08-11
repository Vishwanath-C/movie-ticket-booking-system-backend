package com.example.MovieTicketBooking.service;

import com.example.MovieTicketBooking.dto.requestdtos.TheatreRequestDto;
import com.example.MovieTicketBooking.dto.responsedtos.TheatreResponseDto;
import com.example.MovieTicketBooking.mapper.TheatreRequestDtoMapper;
import com.example.MovieTicketBooking.mapper.TheatreResponseDtoMapper;
import com.example.MovieTicketBooking.model.Theatre;
import com.example.MovieTicketBooking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {
    
    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    TheatreRequestDtoMapper theatreRequestDtoMapper;

    @Autowired
    TheatreResponseDtoMapper theatreResponseDtoMapper;


    public Theatre createTheatre(TheatreRequestDto theatreRequestDto){
        Theatre theatre = theatreRequestDtoMapper.dtoToTheatre(theatreRequestDto);
        return theatreRepository.save(theatre);
    }

     public List<TheatreResponseDto> getAllTheatres(){
        List<Theatre> theatres = theatreRepository.findAll();
        List<TheatreResponseDto> responseDtos = new ArrayList<>();

        for(Theatre theatre : theatres){
            TheatreResponseDto dto = theatreResponseDtoMapper.theatreToDto(theatre);
            responseDtos.add(dto);
        }
        return responseDtos;
    }

    public Theatre getTheatreById(Long id){
        return theatreRepository.findById(id).get();
    }

    public Theatre getTheatreByName(String name){
        return theatreRepository.findByName(name);
    }

    public void deleteTheatre(Long id){
        theatreRepository.delete(getTheatreById(id));
    }


}
