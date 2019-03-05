package com.coolreece.barbershopserver.service;

import com.coolreece.barbershopserver.model.Barber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BarberServiceIntegrationTest {

    @Autowired
    private BarberService barberService;

    @Test
    public void testAddBarberHappyPath() {

        Barber barber = new Barber();
        barber.setFirstName("Dan");
        barber.setLastName("Johnson");

        Barber newBarber = barberService.add(barber);

        assertNotNull(newBarber);
        assertNotNull(newBarber.getId());
        assertEquals("Dan", newBarber.getFirstName());
    }
}
