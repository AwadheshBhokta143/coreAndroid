
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StringOperation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView
        TextView textView = findViewById(R.id.textView);

        // String operations
        String str1 = "Hello, ";
        String str2 = "World!";
        String concatenated = str1 + str2;
        String substring = concatenated.substring(7, 12); // Extract "World"
        int length = concatenated.length();
        boolean equals = str1.equals(str2);
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello, ");
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        String replaced = concatenated.replace("World", "Java");
        String[] split = concatenated.split(", ");

        // Display results in TextView
        String result = "Original strings:\nstr1: " + str1 + "\nstr2: " + str2 + "\n\n" +
                "Concatenated: " + concatenated + "\n" +
                "Substring (7, 12): " + substring + "\n" +
                "Length: " + length + "\n" +
                "Equals (str1 and str2): " + equals + "\n" +
                "Equals Ignore Case (str1 and 'hello, '): " + equalsIgnoreCase + "\n" +
                "Upper Case (str1): " + upperCase + "\n" +
                "Lower Case (str2): " + lowerCase + "\n" +
                "Replaced ('World' with 'Java'): " + replaced + "\n" +
                "Split (by ', '): " + split[0] + " and " + split[1];

        textView.setText(result);
    }
  private void funcx(){}
  private void funcy(){}
}
