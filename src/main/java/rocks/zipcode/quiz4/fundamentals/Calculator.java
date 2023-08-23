package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        ArrayList<Double> newArr = new ArrayList<>();
        for (int i = 0; i < value.length; i++){
            newArr.add(squareRoot(value[i]));
        }
        Double[] doublesArr = newArr.toArray(new Double[0]);
        return doublesArr;
    }

    public static Double[] squares(Double... values) {
        ArrayList<Double> newArr = new ArrayList<>();
        for (int i = 0; i < values.length; i++){
            newArr.add(square(values[i]));
        }
        Double[] doublesArr = newArr.toArray(new Double[0]);
        return doublesArr;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
