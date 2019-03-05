package com.coolreece.barbershopserver.service;

import com.coolreece.barbershopserver.model.Barber;
import com.coolreece.barbershopserver.repository.BarberRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BarberServiceUnitTest {

    @InjectMocks
    private BarberService barberService;

    @Mock
    private BarberRepository barberRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddBarberHappyPath() {

        Barber mockBarber = new Barber();
        mockBarber.setFirstName("Dan");
        mockBarber.setLastName("Johnson");

        when(barberRepository.save(any(Barber.class))).thenReturn(mockBarber);

        Barber newBarber = barberService.add(mockBarber);

        assertEquals("Dan", newBarber.getFirstName());
    }
}
