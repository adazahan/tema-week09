package Statistics;

import domain.Calculator;
import enums.UnitOfMeasure;
import exception.ValidationException;
import service.MetricDistance;

public class StatisticsRepoMain {
    public static void main(String[] args) throws ValidationException {
        Calculator c = new Calculator();
        StatisticsRepo statRepo = new StatisticsRepo();

        MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "+");
        MetricDistance m2 = new MetricDistance(3, UnitOfMeasure.M, "-");

        c.insertMetricDistancesToCompute(m1);
        c.insertMetricDistancesToCompute(m2);

        System.out.println("duration for inserting metric distances: " + statRepo.calculateComputingTimeForInsertMetricDistancesToCompute(m1));

        System.out.println("duration for computing expression: " + statRepo.calculateComputingTimeForComputeExpressionOfSumsAndSubstractions("M"));



    }
}
