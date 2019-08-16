package domain;

import enums.UnitOfMeasure;
import exception.ValidationException;
import service.MetricDistance;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements ICalculator {
    List<MetricDistance> metricDistancesList = new ArrayList<>();


    @Override
    public void insertMetricDistancesToCompute(MetricDistance metricDistance) throws ValidationException {
        if (metricDistance.getOperator().equals("+") || metricDistance.getOperator().equals("-")) {
            metricDistancesList.add(metricDistance);
        } else throw new ValidationException("invalid operator");

    }

    public int getCount()
    {return metricDistancesList.size();}

    @Override
    public double computeExpressionOfSumsAndSubstractions(String unitOutput) {
        double exp = metricDistancesList.get(0).getmValue();
        switch (unitOutput) {
            case "MM": {
                for (int i = 0; i < metricDistancesList.size() - 1; i++) {
                    if (metricDistancesList.get(i).getOperator().equals("+")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 10;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 1000000;
                        }
                    }

                    if (metricDistancesList.get(i).getOperator().equals("-")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 10;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 1000000;
                        }
                    }

                }
            }
            break;
            case "CM": {
                for (int i = 0; i < metricDistancesList.size() - 1; i++) {
                    if (metricDistancesList.get(i).getOperator().equals("+")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue();

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 100000;
                        }
                    }

                    if (metricDistancesList.get(i).getOperator().equals("-")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue();

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 100000;
                        }
                    }

                }
            }
            break;
            case "DM": {
                for (int i = 0; i < metricDistancesList.size() - 1; i++) {
                    if (metricDistancesList.get(i).getOperator().equals("+")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 10;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 10000;
                        }
                    }

                    if (metricDistancesList.get(i).getOperator().equals("-")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 100;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 10;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 10000;
                        }
                    }

                }
            }
            break;
            case "M": {
                for (int i = 0; i < metricDistancesList.size() - 1; i++) {
                    if (metricDistancesList.get(i).getOperator().equals("+")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 100;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() * 1000;
                        }
                    }

                    if (metricDistancesList.get(i).getOperator().equals("-")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 100;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 10;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue();
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() * 1000;
                        }
                    }

                }
            }
            break;
            case "KM": {
                for (int i = 0; i < metricDistancesList.size() - 1; i++) {
                    if (metricDistancesList.get(i).getOperator().equals("+")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 1000000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 100000;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 10000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue() / 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp + metricDistancesList.get(i + 1).getmValue();
                        }
                    }

                    if (metricDistancesList.get(i).getOperator().equals("-")) {
                        if (metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.MM)) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 1000000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.CM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 100000;

                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.DM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 10000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.M))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue() / 1000;
                        }
                        if ((metricDistancesList.get(i).getUnitOfMeasure().equals(UnitOfMeasure.KM))) {
                            exp = exp - metricDistancesList.get(i + 1).getmValue();
                        }
                    }

                }
            }
            break;
            default: {
                System.out.println("invalid unit output");
            }
            break;
        }
        return exp;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "metricDistancesList=" + metricDistancesList +
                '}';
    }
}