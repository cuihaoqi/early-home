package com.feiniaojin.earlyhome.generator.basic.metadata;

import lombok.Data;

@Data
public class TableMetadata {
    private String columnName;
    private String columnType;
    private String columnTypeName;
    private String catalogName;
    private String columnClassName;
    private String columnLabel;
    private String precision;
    private String scale;
    private String schemaName;
    private String tableName;
}
