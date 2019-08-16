package domain;

import domain.Calculator;
import enums.UnitOfMeasure;
import exception.ValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import service.MetricDistance;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    Calculator calculator = new Calculator();


    @Parameterized.Parameter(0)
    public MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "+");
    @Parameterized.Parameter(1)
    public MetricDistance m2 = new MetricDistance(6, UnitOfMeasure.M, "+");
    @Parameterized.Parameter(2)
    public MetricDistance m3 = new MetricDistance(7, UnitOfMeasure.M, "+");
    @Parameterized.Parameter(3)
    public int result;

    MetricDistance input;
    int expected;

    @Parameterized.Parameters
    public List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {m1, 1},
                {m2, 2},
                {m3, 3}
        });
    }

    public ParameterizedTest(MetricDistance input, int expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testInsertMetricDistancesToCompute(MetricDistance metricDistance) throws ValidationException {
        calculator.insertMetricDistancesToCompute(input);
        assertEquals(calculator.getCount(), expected);
    }
}
