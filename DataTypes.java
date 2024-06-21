
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Primitive Data Types
        byte byteVar = 100; // 8-bit integer
        short shortVar = 1000; // 16-bit integer
        int intVar = 100000; // 32-bit integer
        long longVar = 10000000000L; // 64-bit integer
        float floatVar = 10.5f; // 32-bit floating-point
        double doubleVar = 20.5; // 64-bit floating-point
        char charVar = 'A'; // 16-bit Unicode character
        boolean booleanVar = true; // boolean

        // Reference Data Types
        String stringVar = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5}; // Array of integers
        String[] stringArray = {"one", "two", "three"}; // Array of strings

        // Display results in TextView
        String result = "Primitive Data Types:\n" +
                "byte: " + byteVar + "\n" +
                "short: " + shortVar + "\n" +
                "int: " + intVar + "\n" +
                "long: " + longVar + "\n" +
                "float: " + floatVar + "\n" +
                "double: " + doubleVar + "\n" +
                "char: " + charVar + "\n" +
                "boolean: " + booleanVar + "\n\n" +

                "Reference Data Types:\n" +
                "String: " + stringVar + "\n" +
                "int array: " + arrayToString(intArray) + "\n" +
                "String array: " + arrayToString(stringArray);

        textView.setText(result);
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
