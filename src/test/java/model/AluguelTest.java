package model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelTest {
    public float calc(float nominal, int day) throws IOException {
        CalcAluguel aluguel = new CalcAluguel();
        return aluguel.Calc(nominal, day);
    }

   // -----------------------   Casos de testes parametrizados usando CSVSOURCE (array de valores para ir testando) --------------------------------//

    @ParameterizedTest
    @CsvSource(value={
            "-1:0",
            "2700:1",
            "2700:2",
            "2700:4",
            "2700:5",
            "2850:6",
            "2850: 9",
            "2850: 10",
            "3000: 11",
            "3000: 14",
            "3000: 15",
            "3063: 16",
            "3102:29",
            "3105:30",
            "-1: 31"
            }
            , delimiter = ':')
    public void TestAluguelCsv(int expected, int day) throws IOException {
        assertEquals(expected, calc(3000, day));
    }

    // -----------------------   Casos de testes parametrizado usando arquivo com os dados a serem testados --------------------------------//

    @ParameterizedTest(name="Teste {index} => expected={0}," + "day={1}")
    @CsvFileSource(resources="/valores_teste.csv", delimiter = ',')
    public void TestAluguelCsvFile(int expected, int day) throws IOException {
        assertEquals(expected, calc(3000, day));
    }

    // -----------------------   Casos de testes separados por metodos --------------------------------//


    @Test
    public void CaseDay0() throws IOException {
        assertEquals(-1, calc(3000, 0));
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
    public void CaseDay29() throws IOException {
        assertEquals(3102, calc(3000, 29));
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