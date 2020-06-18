package model;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import java.io.IOException;

public class HttpAdapter {
    protected final String base = "https://aluguebug.herokuapp.com/calc?dados=";

    public JSONObject get(String params) throws IOException {
        String url = this.base + params;

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            Gson g = new Gson();
            return new JSONObject(g.fromJson(response.body().string(), String.class));
        }
    }
}
