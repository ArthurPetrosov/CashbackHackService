package ru.netology;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesOne() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount1() {
        int actual = service.remain(1);
        int expected = 999;
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount999() {
        int actual = service.remain(999);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount0() {
        int actual = service.remain(0);
        int expected = 1000;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount1001() {
        int actual = service.remain(1001);
        int expected = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainBoundaryAmount500() {
        int actual = service.remain(500);
        int expected = 500;
        org.testng.Assert.assertEquals(actual, expected);
    }
}
