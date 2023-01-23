package com.example.bookmyshow.model;



import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="movie")
@Data
@Builder
public class MovieEntity {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	
    @Column(nullable = false,unique = true)
    private String movieName;

    private int duration;

    private Date releaseDate;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;


}
