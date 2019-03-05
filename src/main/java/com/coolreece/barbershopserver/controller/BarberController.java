package com.coolreece.barbershopserver.controller;

import com.coolreece.barbershopserver.model.Barber;
import com.coolreece.barbershopserver.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class BarberController {

    @Autowired
    private BarberService barberService;

    @PostMapping(value = "/addBarber")
    public String processAddBarber(@RequestBody Barber barber) {

        Barber addedBarber = barberService.add(barber);

        if (addedBarber != null){
            return "Success";
        }else return "Failure";
    }
}
