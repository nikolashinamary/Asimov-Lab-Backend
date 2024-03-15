package com.example.demo.payload.response;

import java.util.List;

public class TestCheckResponse {

    private List<String> metrics;

    private List<Integer> metricsValues;

    public TestCheckResponse(List<String> metrics, List<Integer> metricsValues){
        this.metrics = metrics;
        this.metricsValues = metricsValues;

    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public List<Integer> getMetricsValues() {
        return metricsValues;
    }

    public void setMetricsValues(List<Integer> metricsValues) {
        this.metricsValues = metricsValues;
    }
}
