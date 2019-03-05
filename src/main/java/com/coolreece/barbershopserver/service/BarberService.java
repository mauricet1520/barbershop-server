package com.coolreece.barbershopserver.service;

import com.coolreece.barbershopserver.model.Barber;
import com.coolreece.barbershopserver.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BarberService {

    @Autowired
    private BarberRepository barberRepository;

    public Barber add(Barber barber) {
        if (barber.getFirstName() != null) {
            barberRepository.save(barber);
            return barber;
        }else return null;
    }
}
