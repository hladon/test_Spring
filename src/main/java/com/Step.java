package com;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class Step {
    private Long id;
    @Autowired
    private Service serviceFrom;
    @Autowired
    private Service serviceTo;
    private Map paramService;
    private Map paramsServiceTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Service getServiceFrom() {
        return serviceFrom;
    }

    public void setServiceFrom(Service serviceFrom) {
        this.serviceFrom = serviceFrom;
    }

    public Service getServiceTo() {
        return serviceTo;
    }

    public void setServiceTo(Service serviceTo) {
        this.serviceTo = serviceTo;
    }

    public Map getParamService() {
        return paramService;
    }

    public void setParamService(Map paramService) {
        this.paramService = paramService;
    }

    public Map getParamsServiceTo() {
        return paramsServiceTo;
    }

    public void setParamsServiceTo(Map paramsServiceTo) {
        this.paramsServiceTo = paramsServiceTo;
    }
}
