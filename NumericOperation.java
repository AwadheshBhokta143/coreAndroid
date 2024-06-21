
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NumericOperation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Arithmetic operations
        int a = 10;
        int b = 3;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        int modulus = a % b;

        // Mathematical operations
        double power = Math.pow(a, b);
        double squareRoot = Math.sqrt(a);
        double sine = Math.sin(Math.toRadians(30));  // sine of 30 degrees
        double cosine = Math.cos(Math.toRadians(60));  // cosine of 60 degrees
        double tangent = Math.tan(Math.toRadians(45));  // tangent of 45 degrees

        // Display results in TextView
        String result = "Arithmetic operations:\n" +
                "a: " + a + ", b: " + b + "\n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + quotient + "\n" +
                "Modulus: " + modulus + "\n\n" +
                "Mathematical operations:\n" +
                "Power (a^b): " + power + "\n" +
                "Square Root (a): " + squareRoot + "\n" +
                "Sine (30 degrees): " + sine + "\n" +
                "Cosine (60 degrees): " + cosine + "\n" +
                "Tangent (45 degrees): " + tangent;

        textView.setText(result);
    }
}
