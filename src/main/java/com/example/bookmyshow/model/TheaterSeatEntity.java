package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="theater_seat")
public class TheaterSeatEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	
	    @Column(columnDefinition = "seat_no",nullable = false)
	    private String seatNo;

	    @Enumerated(value = EnumType.STRING)
	    private SeatType seatType;

	    private int rate;

	    @ManyToOne
	    @JoinColumn
	    private TheaterEntity theater;
}
