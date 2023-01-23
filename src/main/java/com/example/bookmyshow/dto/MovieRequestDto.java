package com.example.bookmyshow.dto;

import java.util.Date;

import lombok.Data;


@Data
public class MovieRequestDto {

	private String name;
	
	private Date releaseDate;
}
