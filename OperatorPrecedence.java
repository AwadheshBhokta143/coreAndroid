
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OperatorPrecedence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Variables for demonstration
        int a = 10;
        int b = 3;
        int c = 5;

        // Arithmetic Operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        int modulus = a % b;

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        // Logical Operators
        boolean andOperation = (a > b) && (a > c);
        boolean orOperation = (a > b) || (a < c);
        boolean notOperation = !(a > b);

        // Operator Precedence
        int precedenceExample1 = a + b * c; // Expected: 10 + (3 * 5) = 25
        int precedenceExample2 = (a + b) * c; // Expected: (10 + 3) * 5 = 65
        boolean precedenceExample3 = a > b && b < c || a == b; // Expected: (10 > 3) && (3 < 5) || (10 == 3) = true

        // Display results in TextView
        String result = "Arithmetic Operators:\n" +
                "Sum (a + b): " + sum + "\n" +
                "Difference (a - b): " + difference + "\n" +
                "Product (a * b): " + product + "\n" +
                "Quotient (a / b): " + quotient + "\n" +
                "Modulus (a % b): " + modulus + "\n\n" +

                "Relational Operators:\n" +
                "a == b: " + isEqual + "\n" +
                "a != b: " + isNotEqual + "\n" +
                "a > b: " + isGreater + "\n" +
                "a < b: " + isLess + "\n" +
                "a >= b: " + isGreaterOrEqual + "\n" +
                "a <= b: " + isLessOrEqual + "\n\n" +

                "Logical Operators:\n" +
                "(a > b) && (a > c): " + andOperation + "\n" +
                "(a > b) || (a < c): " + orOperation + "\n" +
                "!(a > b): " + notOperation + "\n\n" +

                "Operator Precedence:\n" +
                "a + b * c: " + precedenceExample1 + "\n" +
                "(a + b) * c: " + precedenceExample2 + "\n" +
                "a > b && b < c || a == b: " + precedenceExample3;

        textView.setText(result);
    }
}
