package com.coolreece.barbershopserver.repository;

import com.coolreece.barbershopserver.model.Barber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BarberRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BarberRepository barberRepository;

    @Test
    public void testFindByName() {

        Barber barber = new Barber();
        barber.setFirstName("Ted");
        entityManager.persist(barber);

        Barber foundBarber = barberRepository.findByFirstName("Ted");

        assertThat(foundBarber.getFirstName(),is(equalTo("Ted")));
    }
}
