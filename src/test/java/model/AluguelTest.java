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
    public void FirstCaseDay2() throws IOException {
        assertEquals(2700, calc(3000, 2));
    }

    @Test
    public void FirstCaseDay4() throws IOException {
        assertEquals(2700, calc(3000, 4));
    }

    @Test
    public void SecondCaseDay7() throws IOException {
        assertEquals(2850, calc(3000, 7) );
    }

    @Test
    public void SecondCaseDay9() throws IOException {
        assertEquals(2850, calc(3000, 9) );
    }

    @Test
    public void ThirdCaseDay12() throws IOException {
        assertEquals(3000, calc(3000, 12));
    }

    @Test
    public void ThirdCaseDay14() throws IOException {
        assertEquals(3000, calc(3000, 14));
    }

    @Test
    public void FourthCaseDay17() throws IOException {
        assertEquals(3066, calc(3000, 17));
    }

    @Test
    public void FourthCaseDay29() throws IOException {
        assertEquals(3102, calc(3000, 29));
    }
}