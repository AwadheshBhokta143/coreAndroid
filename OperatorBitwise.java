
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OperatorBitwise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // Variables for demonstration
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise XOR (^)
        int xorResult = a ^ b; // Expected: 0110 (6 in decimal)

        // Bitwise NOR (NOT OR)
        int norResult = ~(a | b); // Expected: 10000 (binary of -8 in two's complement)

        // Bitwise NAND (NOT AND)
        int nandResult = ~(a & b); // Expected: 1111 (binary of -6 in two's complement)

        // Display results in TextView
        String result = "Bitwise Operations:\n" +
                "a: " + a + " (Binary: " + Integer.toBinaryString(a) + ")\n" +
                "b: " + b + " (Binary: " + Integer.toBinaryString(b) + ")\n\n" +

                "XOR (a ^ b): " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")\n" +
                "NOR ~(a | b): " + norResult + " (Binary: " + Integer.toBinaryString(norResult) + ")\n" +
                "NAND ~(a & b): " + nandResult + " (Binary: " + Integer.toBinaryString(nandResult) + ")";

        textView.setText(result);
    }
}
