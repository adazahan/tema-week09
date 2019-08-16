package Statistics;

import domain.Calculator;
import exception.ValidationException;
import service.MetricDistance;

import java.time.Duration;
import java.time.Instant;

public class StatisticsRepo {
    Calculator c = new Calculator();

    public Duration calculateComputingTimeForInsertMetricDistancesToCompute(MetricDistance metricDistance) throws ValidationException {
        Instant start = Instant.now();
        c.insertMetricDistancesToCompute(metricDistance);
        Instant stop = Instant.now();
        Duration duration = Duration.between(start, stop);
        return duration;
    }

    public  Duration calculateComputingTimeForComputeExpressionOfSumsAndSubstractions(String unitOutput) {
        Instant start = Instant.now();
        c.computeExpressionOfSumsAndSubstractions(unitOutput);
        Instant stop = Instant.now();
        Duration duration = Duration.between(start, stop);
        return duration;
    }



}
