package com.example.reactive.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "person", shards = 3)
@Data
public class Person {
    @Id
    private String id;
    private String firstname;
    private String lastname;
}
