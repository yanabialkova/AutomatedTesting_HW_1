//package ru.netology.servise;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class CashbackServiceTestNG {
//
//    @Test
//    public void shouldPositiveResult() {
//        CashbackHackService service = new CashbackHackService();
//
//        int amount = 900;
//
//        int actual = service.remain(amount);
//        int expected = 100;
//
//       Assert.assertEquals(actual,expected);
//
//    }
//
//    @Test
//    public void shouldNegativeNumber() {
//        CashbackHackService service = new CashbackHackService();
//
//        int amount = -1000;
//
//        int actual = service.remain(amount);
//        int expected = 1000;
//
//        Assert.assertEquals(actual,expected);
//
//    }
//}
