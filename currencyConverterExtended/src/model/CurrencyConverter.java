package model;

public class CurrencyConverter
{
    public double euroToYen(double euro)
    {
        return euro * 124.205;
    }

    public double euroToDollar(double euro)
    {
        return euro / 0.8445;
    }
}