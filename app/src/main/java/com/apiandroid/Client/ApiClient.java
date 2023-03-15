package com.apiandroid.Client;

import com.apiandroid.Entities.Alumno;
import com.apiandroid.Interfaz.AlumnoService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL = "http://10.0.2.2:8082/";
    private static Retrofit retrofit;

    public static AlumnoService getAlumnoService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(AlumnoService.class);
    }
}