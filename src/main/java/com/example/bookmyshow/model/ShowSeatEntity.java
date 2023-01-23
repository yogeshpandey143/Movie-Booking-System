package com.example.bookmyshow.model;

import java.time.LocalTime;
import java.util.Date;

import com.example.bookmyshow.enums.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="showSeat")
@Data
public class ShowSeatEntity {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String seatNo;
	
	
	

    private boolean booked;


    private Date bookedAt;


    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @ManyToOne
    @JoinColumn
    private TicketEntity ticket;
}
