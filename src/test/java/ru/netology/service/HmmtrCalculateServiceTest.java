package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class HmmtrCalculateServiceTest {

    @Test
    public void shouldCalculate () {
        HmmtrCalculateService service = new HmmtrCalculateService();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculate2 () {
        HmmtrCalculateService service = new HmmtrCalculateService();
        int income = 100_000;
        int expenses = 60000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
    }

}
