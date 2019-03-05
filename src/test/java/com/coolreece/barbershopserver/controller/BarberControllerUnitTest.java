package com.coolreece.barbershopserver.controller;

import com.coolreece.barbershopserver.model.Barber;
import com.coolreece.barbershopserver.service.BarberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BarberController.class)
public class BarberControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BarberService barberService;

    @InjectMocks
    private BarberController barberController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddBarberHappyPath() throws Exception {
        Barber mockBarber = new Barber();
        mockBarber.setFirstName("Fred");

        when(barberService.add(any(Barber.class))).thenReturn(mockBarber);

        Barber barber = new Barber();
        barber.setFirstName("Fred");
        barber.setLastName("Eastwood");

        mockMvc.perform(post("/addBarber", barber))
                .andExpect(status().isOk()).andReturn();

    }
}
