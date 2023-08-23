package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        if (values.length % 2 == 0){
            String x = values[(values.length/2) - 1];
            String y = values[values.length/2];
            return x + y;
        } else {
            String z = values[values.length/2];
            return z;
        }

    }

    public static String[] removeMiddleElement(String[] values) {
        int middleStart = (values.length - 1) / 2;
        int middleEnd = (values.length - 1) - middleStart;
        int elementsToRemove = middleEnd - middleStart + 1;

        String[] newArr = new String[values.length - elementsToRemove];
        System.arraycopy(values, 0, newArr, 0, middleStart);
        System.arraycopy(values, middleEnd + 1, newArr, middleStart, middleStart);
        return newArr;
//        ArrayList<String> newArr = new ArrayList<>();
//        for (int i = 0; i < values.length; i++){
//            if (values.length % 2 == 0){
//                String x = values[(values.length/2) - 1];
//                String y = values[values.length/2];
//                return x + y;
//            } else {
//                String z = values[values.length/2];
//                return z;
//            }
//        }
//
//        return null;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < values.length - 1; i++){
            newArr.add(values[i]);
        }
        String[] strArr = newArr.toArray(new String[0]);
        return strArr;
    }
}