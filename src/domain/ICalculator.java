package domain;

import exception.ValidationException;
import service.MetricDistance;

public interface ICalculator {
    void insertMetricDistancesToCompute(MetricDistance metricDistance) throws ValidationException;

    double computeExpressionOfSumsAndSubstractions(String unitOutput);

}
