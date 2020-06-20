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
   public void CaseDay0() throws IOException {
       assertEquals(2700, calc(3000, 0));
   }

    @Test
    public void CaseDay1() throws IOException {
        assertEquals(2700, calc(3000, 1));
    }

    @Test
    public void CaseDay2() throws IOException {
        assertEquals(2700, calc(3000, 2));
    }

    @Test
    public void CaseDay4() throws IOException {
        assertEquals(2700, calc(3000, 4));
    }

    @Test
    public void CaseDay5() throws IOException {
        assertEquals(2700, calc(3000, 5));
    }

    @Test
    public void CaseDay6() throws IOException {
        assertEquals(2850, calc(3000, 6) );
    }

    @Test
    public void CaseDay7() throws IOException {
        assertEquals(2850, calc(3000, 7) );
    }

    @Test
    public void CaseDay9() throws IOException {
        assertEquals(2850, calc(3000, 9) );
    }

    @Test
    public void CaseDay10() throws IOException {
        assertEquals(2850, calc(3000, 10) );
    }

    @Test
    public void CaseDay11() throws IOException {
        assertEquals(3000, calc(3000, 11));
    }

    @Test
    public void CaseDay12() throws IOException {
        assertEquals(3000, calc(3000, 12));
    }

    @Test
    public void CaseDay14() throws IOException {
        assertEquals(3000, calc(3000, 14));
    }

    @Test
    public void CaseDay15() throws IOException {
        assertEquals(3000, calc(3000, 15));
    }

    @Test
    public void CaseDay16() throws IOException {
        assertEquals(3063, calc(3000, 16));
    }

    @Test
    public void CaseDay17() throws IOException {
        assertEquals(3066, calc(3000, 17));
    }

    @Test
    public void CaseDay29() throws IOException {
        assertEquals(3102, calc(3000, 30));
    }

    @Test
    public void CaseDay30() throws IOException {
        assertEquals(3105, calc(3000, 30));
    }

    @Test
    public void CaseDay31() throws IOException {
        assertEquals(-1, calc(3000, 31));
    }
}