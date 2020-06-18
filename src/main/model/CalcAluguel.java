package model;

import org.json.JSONObject;

import java.io.IOException;

public class CalcAluguel {
    public Float Calc(float valorNominal, int day) throws IOException {
        String params = "{\"valor_nominal\":"+valorNominal+",\"dia\":"+day+"}";
        HttpAdapter http = new HttpAdapter();

        JSONObject resp = http.get(params);

        return resp.getFloat("valor_calculado");
    }
}