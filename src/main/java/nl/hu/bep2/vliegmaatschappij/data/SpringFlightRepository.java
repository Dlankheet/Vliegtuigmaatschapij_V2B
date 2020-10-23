package nl.hu.bep2.vliegmaatschappij.data;

import nl.hu.bep2.vliegmaatschappij.domein.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface SpringFlightRepository extends JpaRepository<Flight, Integer> {
	@Query("SELECT flight FROM Flight flight WHERE flight.route.departure.code= :depart AND flight.route.destination.code= :destination AND flight.departureTime= :date")
	List<Flight> findByFlight(@Param("depart") String depart, @Param("destination") String destination, @Param("date") LocalDate date);
}
