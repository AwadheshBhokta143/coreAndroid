package com.example.arraysdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Arrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Arrays for different data types
        byte[] byteArray = {1, 2, 3, 4, 5};
        short[] shortArray = {100, 200, 300, 400, 500};
        int[] intArray = {1000, 2000, 3000, 4000, 5000};
        long[] longArray = {100000L, 200000L, 300000L, 400000L, 500000L};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] doubleArray = {10.1, 20.2, 30.3, 40.4, 50.5};
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        boolean[] booleanArray = {true, false, true, false, true};
        String[] stringArray = {"one", "two", "three", "four", "five"};

        // Display results in TextView
        String result = "Arrays for different data types:\n" +
                "byte array: " + arrayToString(byteArray) + "\n" +
                "short array: " + arrayToString(shortArray) + "\n" +
                "int array: " + arrayToString(intArray) + "\n" +
                "long array: " + arrayToString(longArray) + "\n" +
                "float array: " + arrayToString(floatArray) + "\n" +
                "double array: " + arrayToString(doubleArray) + "\n" +
                "char array: " + arrayToString(charArray) + "\n" +
                "boolean array: " + arrayToString(booleanArray) + "\n" +
                "String array: " + arrayToString(stringArray);

        textView.setText(result);
    }

    // Helper method to convert byte array to string
    private String arrayToString(byte[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert short array to string
    private String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert int array to string
    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert long array to string
    private String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert float array to string
    private String arrayToString(float[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert double array to string
    private String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert char array to string
    private String arrayToString(char[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert boolean array to string
    private String arrayToString(boolean[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Helper method to convert String array to string
    private String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
