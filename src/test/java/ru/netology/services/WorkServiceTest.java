package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.WorkService;

public class WorkServiceTest {

    @ParameterizedTest
    //  @CsvSource({
    //          "3,10000,3000,20000",
    //          "2,100000,60000,150000"
    // })

    @CsvFileSource(files = "src/test/resources/relax.csv")
    public void testWorkRelax(int expected, int income, int expenses, int threshold) {
        WorkService service = new WorkService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    // @Test
    // public void shouldCalcWorkRelax() {
    // WorkService service = new WorkService();

    // int expected = 3;
    // int actual = service.calculate(10000, 3000, 20000);

    // Assertions.assertEquals(expected, actual);
    // }

    // @Test
    // public void shouldCalcRelaxWork() {
    // WorkService service = new WorkService();

    // int expected = 2;
    // int actual = service.calculate(100000, 60000, 150000);

    // Assertions.assertEquals(expected, actual);
    //}

}
