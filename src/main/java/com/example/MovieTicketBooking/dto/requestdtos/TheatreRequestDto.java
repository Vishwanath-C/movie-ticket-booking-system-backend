package com.example.MovieTicketBooking.dto.requestdtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheatreRequestDto
 {
    private String name;
    private String location;
}
