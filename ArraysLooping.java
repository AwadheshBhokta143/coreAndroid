
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArraysLooping extends AppCompatActivity {

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
        String result = "Arrays for different data types:\n\n" +
                "byte array: " + loopArray(byteArray) + "\n" +
                "short array: " + loopArray(shortArray) + "\n" +
                "int array: " + loopArray(intArray) + "\n" +
                "long array: " + loopArray(longArray) + "\n" +
                "float array: " + loopArray(floatArray) + "\n" +
                "double array: " + loopArray(doubleArray) + "\n" +
                "char array: " + loopArray(charArray) + "\n" +
                "boolean array: " + loopArray(booleanArray) + "\n" +
                "String array: " + loopArray(stringArray);

        textView.setText(result);
    }

    // Helper method to loop through byte array
    private String loopArray(byte[] array) {
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

    // Helper method to loop through short array
    private String loopArray(short[] array) {
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

    // Helper method to loop through int array
    private String loopArray(int[] array) {
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

    // Helper method to loop through long array
    private String loopArray(long[] array) {
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

    // Helper method to loop through float array
    private String loopArray(float[] array) {
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

    // Helper method to loop through double array
    private String loopArray(double[] array) {
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

    // Helper method to loop through char array
    private String loopArray(char[] array) {
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

    // Helper method to loop through boolean array
    private String loopArray(boolean[] array) {
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

    // Helper method to loop through String array
    private String loopArray(String[] array) {
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
