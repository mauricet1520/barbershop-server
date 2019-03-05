package com.coolreece.barbershopserver;

import com.coolreece.barbershopserver.controller.BarberControllerIntegrationTest;
import com.coolreece.barbershopserver.repository.BarberRepositoryIntegrationTest;
import com.coolreece.barbershopserver.service.BarberServiceIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BarberControllerIntegrationTest.class, BarberRepositoryIntegrationTest.class,
        BarberServiceIntegrationTest.class})
public class AddBarberFeatureTestSuite {
}
