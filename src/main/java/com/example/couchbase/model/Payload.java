package com.example.couchbase.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
public class Payload {
    @Id
    String id;
}
