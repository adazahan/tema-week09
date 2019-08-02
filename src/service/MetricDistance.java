package service;

import enums.UnitOfMeasure;

public class MetricDistance {
    private double mValue;
    private UnitOfMeasure unitOfMeasure;
    private String operator;

    public MetricDistance(double mValue, UnitOfMeasure unitOfMeasure, String operator) {
        this.mValue = mValue;
        this.unitOfMeasure = unitOfMeasure;
        this.operator = operator;
    }

    public double getmValue() {
        return mValue;
    }

    public void setmValue(double mValue) {
        this.mValue = mValue;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "MetricDistance{" +
                "mValue=" + mValue +
                ", unitOfMeasure=" + unitOfMeasure +
                ", operator='" + operator + '\'' +
                '}';
    }
}
