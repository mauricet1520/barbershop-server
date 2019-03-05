package com.coolreece.barbershopserver.controller;


import com.coolreece.barbershopserver.model.Barber;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BarberControllerIntegrationTest {

    @Autowired
    BarberController barberController;

    @Test
    public void testAddBarberHappyPath() {

        Barber barber = new Barber();
        barber.setLastName("Revis");
        barber.setFirstName("West");

        String outcome = barberController.processAddBarber(barber);
        assertThat(outcome, is(equalTo("Success")));
    }

    @Test
    public void testAddBarberWhenFirstNameIsMissing() {
        Barber barber = new Barber();
        String outcome = barberController.processAddBarber(barber);
        assertThat(outcome, is(equalTo("Failure")));



    }
}
