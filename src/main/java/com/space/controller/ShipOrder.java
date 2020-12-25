package com.space.controller;

//let's start! GitHub commit test...

public enum ShipOrder {
    ID("id"), // default
    SPEED("speed"),
    DATE("prodDate"),
    RATING("rating");

    private String fieldName;

    ShipOrder(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}