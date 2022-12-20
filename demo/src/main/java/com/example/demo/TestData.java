package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestData {
    private String name;
    private Integer id;
    private Integer objectId;
    private Integer principalId;
    private Integer schemaId;
    private Integer parentObjectId;
    private String type;
    private String typeDesc;
// private create_date timestamp,
// modify_date timestamp,
    private Boolean isMsShipped;
    private Boolean isPublished;
    private Boolean isSchemaPublished;
}