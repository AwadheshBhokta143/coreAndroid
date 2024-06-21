
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArraysMatrix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // 6x6 Multidimensional arrays for different data types
        int[][] intArray = new int[6][6];
        float[][] floatArray = new float[6][6];
        double[][] doubleArray = new double[6][6];
        char[][] charArray = new char[6][6];
        boolean[][] booleanArray = new boolean[6][6];
        String[][] stringArray = new String[6][6];

        // Fill arrays with example data
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                intArray[i][j] = i * 6 + j;
                floatArray[i][j] = (float) (i * 6 + j + 0.1);
                doubleArray[i][j] = (i * 6 + j + 0.01);
                charArray[i][j] = (char) ('A' + i * 6 + j);
                booleanArray[i][j] = (i + j) % 2 == 0;
                stringArray[i][j] = "str" + (i * 6 + j);
            }
        }

        // Display results in TextView
        String result = "6x6 Multidimensional arrays for different data types:\n\n" +
                "int array:\n" + loopArray(intArray) + "\n\n" +
                "float array:\n" + loopArray(floatArray) + "\n\n" +
                "double array:\n" + loopArray(doubleArray) + "\n\n" +
                "char array:\n" + loopArray(charArray) + "\n\n" +
                "boolean array:\n" + loopArray(booleanArray) + "\n\n" +
                "String array:\n" + loopArray(stringArray);

        textView.setText(result);
    }

    // Helper method to loop through int array
    private String loopArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    // Helper method to loop through float array
    private String loopArray(float[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    // Helper method to loop through double array
    private String loopArray(double[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    // Helper method to loop through char array
    private String loopArray(char[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    // Helper method to loop through boolean array
    private String loopArray(boolean[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    // Helper method to loop through String array
    private String loopArray(String[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("[");
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
