package com.example.bookmyshow.model;

import java.util.List;

import com.example.bookmyshow.enums.SeatType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater")
@Data
@NoArgsConstructor
public class TheaterEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    private String name;

    private String city;

    private String address;

    
    //List of shows
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;


    //List of theater seats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<TheaterSeatEntity> theaterSeatEntityList;
	
	
}
