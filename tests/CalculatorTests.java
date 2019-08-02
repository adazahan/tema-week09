import domain.Calculator;
import domain.ICalculator;
import enums.UnitOfMeasure;
import exception.ValidationException;
import org.junit.*;
import service.MetricDistance;

import static junit.framework.Assert.*;
import static org.junit.Assert.fail;

public class CalculatorTests {
    private Calculator unitConvertor;

    @Before
    public void setup() {
        unitConvertor = new Calculator();
    }

    @Test(expected = ValidationException.class)
    public void testWhenInsertInvalidOperator() throws ValidationException {
        MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "%");

        unitConvertor.insertMetricDistancesToCompute(m1);

        fail("should have thrown validation exception");
    }

    @Test
    public void testWhenComputeExpressionInM() throws ValidationException {
        MetricDistance m1 = new MetricDistance(5, UnitOfMeasure.M, "+");
        MetricDistance m2 = new MetricDistance(3, UnitOfMeasure.M, "-");
        MetricDistance m3 = new MetricDistance(5, UnitOfMeasure.M, "+");
        MetricDistance m4 = new MetricDistance(5, UnitOfMeasure.M, "-");
        MetricDistance m5 = new MetricDistance(5, UnitOfMeasure.M, "+");

        unitConvertor.insertMetricDistancesToCompute(m1);
        unitConvertor.insertMetricDistancesToCompute(m2);
        unitConvertor.insertMetricDistancesToCompute(m3);
        unitConvertor.insertMetricDistancesToCompute(m4);
        unitConvertor.insertMetricDistancesToCompute(m5);

        assertEquals(3.0, unitConvertor.computeExpressionOfSumsAndSubstractions("M"));
    }

    @Test
    public void testWhenComputeExpressionInCM() throws ValidationException {
        MetricDistance m1 = new MetricDistance(10, UnitOfMeasure.CM, "+");
        MetricDistance m2 = new MetricDistance(1, UnitOfMeasure.CM, "-");
        MetricDistance m3 = new MetricDistance(10, UnitOfMeasure.CM, "-");

        unitConvertor.insertMetricDistancesToCompute(m1);
        unitConvertor.insertMetricDistancesToCompute(m2);
        unitConvertor.insertMetricDistancesToCompute(m3);


        assertEquals(1.0, unitConvertor.computeExpressionOfSumsAndSubstractions("CM"));
    }

    @Test
    public void testWhenComputeExpressionInKM() throws ValidationException {
        MetricDistance m1 = new MetricDistance(10, UnitOfMeasure.KM, "+");
        MetricDistance m2 = new MetricDistance(1, UnitOfMeasure.KM, "+");
        MetricDistance m3 = new MetricDistance(10, UnitOfMeasure.KM, "+");

        unitConvertor.insertMetricDistancesToCompute(m1);
        unitConvertor.insertMetricDistancesToCompute(m2);
        unitConvertor.insertMetricDistancesToCompute(m3);


        assertEquals(21.0, unitConvertor.computeExpressionOfSumsAndSubstractions("KM"));
    }

    @Test
    public void testWhenComputeExpressionInDM() throws ValidationException {
        MetricDistance m1 = new MetricDistance(10, UnitOfMeasure.DM, "+");
        MetricDistance m2 = new MetricDistance(1, UnitOfMeasure.DM, "+");
        MetricDistance m3 = new MetricDistance(10, UnitOfMeasure.DM, "+");

        unitConvertor.insertMetricDistancesToCompute(m1);
        unitConvertor.insertMetricDistancesToCompute(m2);
        unitConvertor.insertMetricDistancesToCompute(m3);


        assertEquals(21.0, unitConvertor.computeExpressionOfSumsAndSubstractions("DM"));
    }

    @Test
    public void testWhenComputeExpressionInMMandValuesNotAdded() throws ValidationException {
        MetricDistance m1 = new MetricDistance(10, UnitOfMeasure.MM, "-");
        MetricDistance m2 = new MetricDistance(1, UnitOfMeasure.MM, "+");
        MetricDistance m3 = new MetricDistance(1, UnitOfMeasure.MM, "+");


        unitConvertor.insertMetricDistancesToCompute(m1);
        unitConvertor.insertMetricDistancesToCompute(m2);


        assertEquals(9.0, unitConvertor.computeExpressionOfSumsAndSubstractions("MM"));
    }

}
