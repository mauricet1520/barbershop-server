package com.coolreece.barbershopserver.repository;

import com.coolreece.barbershopserver.model.Barber;
import org.springframework.data.repository.CrudRepository;

public interface BarberRepository extends CrudRepository<Barber, Integer> {

    Barber findByFirstName(String firstName);
}
