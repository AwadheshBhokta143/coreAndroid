import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class KernelLogging extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() method called");

        // Example of logging different log levels
        Log.v(TAG, "Verbose log");
        Log.i(TAG, "Info log");
        Log.w(TAG, "Warning log");
        Log.e(TAG, "Error log");

        // Example of conditional logging
        int value = 10;
        if (value > 5) {
            Log.d(TAG, "Value is greater than 5");
        } else {
            Log.d(TAG, "Value is not greater than 5");
        }

        // Example of exception handling and logging
        try {
            String nullString = null;
            nullString.length(); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            Log.e(TAG, "NullPointerException occurred", e);
            Toast.makeText(this, "NullPointerException occurred", Toast.LENGTH_SHORT).show();
        }

        // Example of method call logging
        int result = addNumbers(5, 3);
        Log.i(TAG, "Result of adding numbers: " + result);
    }

    // Example method to add two numbers
    private int addNumbers(int a, int b) {
        Log.v(TAG, "Adding numbers: " + a + " and " + b);
        return a + b;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() method called");
    }
}
