
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArraysMultidimension extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Multidimensional arrays for different data types
        int[][] intArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        float[][] floatArray = {
                {1.1f, 2.2f, 3.3f},
                {4.4f, 5.5f, 6.6f},
                {7.7f, 8.8f, 9.9f}
        };

        double[][] doubleArray = {
                {10.1, 20.2, 30.3},
                {40.4, 50.5, 60.6},
                {70.7, 80.8, 90.9}
        };

        char[][] charArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        boolean[][] booleanArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        String[][] stringArray = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };

        // Display results in TextView
        String result = "Multidimensional arrays for different data types:\n\n" +
                "int array: \n" + loopArray(intArray) + "\n\n" +
                "float array: \n" + loopArray(floatArray) + "\n\n" +
                "double array: \n" + loopArray(doubleArray) + "\n\n" +
                "char array: \n" + loopArray(charArray) + "\n\n" +
                "boolean array: \n" + loopArray(booleanArray) + "\n\n" +
                "String array: \n" + loopArray(stringArray);

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
