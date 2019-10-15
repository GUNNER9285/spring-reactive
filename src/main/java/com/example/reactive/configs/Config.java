package com.example.reactive.configs;

import org.elasticsearch.action.index.IndexResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;
import org.springframework.data.elasticsearch.config.AbstractReactiveElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import reactor.core.publisher.Mono;

@Configuration
@EnableReactiveElasticsearchRepositories
public class Config  {

    @Bean
    ReactiveElasticsearchClient client() {

        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9291")
                .build();

        return ReactiveRestClients.create(clientConfiguration);
    }
}
