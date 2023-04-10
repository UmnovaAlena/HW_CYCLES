package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.WorkService;

public class WorkServiceTest {

    @Test
    public void shouldCalcWorkRelax() {
        WorkService service = new WorkService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcRelaxWork() {
        WorkService service = new WorkService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

}
