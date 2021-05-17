package com.example.springdataelasticsearchdb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "author")
@Getter
@Setter
@NoArgsConstructor
public class Author {

    @Id
    private String id;

    private String name;

}
