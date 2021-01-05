package com.everis.fingerprints.app.config;

import com.everis.fingerprints.app.repository.FingerPrintsRepository;
import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class ClientRetrofitConfig {
    /**
     *
     * @return repository.
     */
    @Bean
    FingerPrintsRepository repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8001")
                .addCallAdapterFactory(ReactorCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(FingerPrintsRepository.class);
    }
}
