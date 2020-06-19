package model;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelTest {
    public float calc(float nominal, int day) throws IOException {
        CalcAluguel aluguel = new CalcAluguel();
        return aluguel.Calc(nominal, day);
    }

   // -----------------------   Casos de testes --------------------------------//

    @Test
    public void FirstCaseDay1() throws IOException {
        assertEquals(2700, calc(3000, 1));
    }

    @Test
    public void FirstCaseDay5() throws IOException {
        assertEquals(2700, calc(3000, 5));
    }

    @Test
    public void SecondCaseDay6() throws IOException {
        assertEquals(2850, calc(3000, 6) );
    }

    @Test
    public void SecondCaseDay10() throws IOException {
        assertEquals(2850, calc(3000, 10) );
    }

    @Test
    public void ThirdCaseDay11() throws IOException {
        assertEquals(3000, calc(3000, 11));
    }

    @Test
    public void ThirdCaseDay15() throws IOException {
        assertEquals(3000, calc(3000, 15));
    }

    @Test
    public void FourthCaseDay16() throws IOException {
        assertEquals(3063, calc(3000, 16));
    }

    @Test
    public void FourthCaseDay30() throws IOException {
        assertEquals(3105, calc(3000, 30));
    }
}