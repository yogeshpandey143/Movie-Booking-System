package com.example.bookmyshow.model;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="show")
@Data
public class ShowEntity {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	
	
	@Column(nullable = false, unique=true)
	private String movieName;
	
	
	
	private LocalTime showTime;
	
	
	
	private LocalTime show;
	
	
    @CreationTimestamp
    private Date createdOn;


    @UpdateTimestamp
    private Date updatedOn;


    @ManyToOne
    @JoinColumn
    private MovieEntity movie;


    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;


    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfSeats;


    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<TicketEntity> listOfTickets;


}
