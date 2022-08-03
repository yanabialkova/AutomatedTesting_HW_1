package ru.netology.servise;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTestJUnit4 {

    @Test
    public void shouldNegativeNumber() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumber() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}