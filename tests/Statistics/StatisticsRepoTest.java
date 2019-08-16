package Statistics;

import domain.Calculator;
import enums.UnitOfMeasure;
import exception.ValidationException;
import org.junit.Before;
import org.junit.Test;
import service.MetricDistance;

import static org.junit.Assert.*;

public class StatisticsRepoTest {
    private Calculator c;
    private StatisticsRepo statRepo;

    @Before
    public void setup() {
        Calculator c = new Calculator();
        StatisticsRepo statRepo = new StatisticsRepo();
    }


    @Test
    public void testCalculateComputingTimeForInsertMetricDistancesToCompute() throws ValidationException {
        MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "+");
        assertEquals("PT0S", statRepo.calculateComputingTimeForInsertMetricDistancesToCompute(m1));

    }

    @Test
    public void calculateComputingTimeForComputeExpressionOfSumsAndSubstractions() throws ValidationException {
        MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "+");
        MetricDistance m2 = new MetricDistance(3, UnitOfMeasure.M, "-");

        c.insertMetricDistancesToCompute(m1);
        c.insertMetricDistancesToCompute(m2);
        assertEquals("PT0S", statRepo.calculateComputingTimeForComputeExpressionOfSumsAndSubstractions("M"));

    }
}