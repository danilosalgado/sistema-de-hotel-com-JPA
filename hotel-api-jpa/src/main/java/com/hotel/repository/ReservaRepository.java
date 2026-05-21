package com.hotel.repository;
import com.hotel.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    List<Reserva> findByEmail(String email);
}
