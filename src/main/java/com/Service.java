package com;

import java.awt.*;

public class Service {
    private Long id;
    private String name;
    private List paramsToCall;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getParamsToCall() {
        return paramsToCall;
    }

    public void setParamsToCall(List paramsToCall) {
        this.paramsToCall = paramsToCall;
    }
}
