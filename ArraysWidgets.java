
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;

public class ArraysWidgets extends AppCompatActivity {

    // Number of widgets
    private static final int NUM_WIDGETS = 6;

    // Arrays of widgets
    private Button[] buttons = new Button[NUM_WIDGETS];
    private TextView[] textViews = new TextView[NUM_WIDGETS];
    private EditText[] editTexts = new EditText[NUM_WIDGETS];

    // Arrays of integers for IDs
    private int[] buttonIds = new int[NUM_WIDGETS];
    private int[] textViewIds = new int[NUM_WIDGETS];
    private int[] editTextIds = new int[NUM_WIDGETS];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a LinearLayout to hold all widgets
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

        // Initialize the ID arrays with unique IDs
        for (int i = 0; i < NUM_WIDGETS; i++) {
            buttonIds[i] = View.generateViewId();
            textViewIds[i] = View.generateViewId();
            editTextIds[i] = View.generateViewId();
        }

        // Initialize and configure the widgets using a loop with a range
        for (int i = 0; i < NUM_WIDGETS; i++) {
            // Initialize buttons
            buttons[i] = new Button(this);
            buttons[i].setText("Button " + (i + 1));
            buttons[i].setId(buttonIds[i]); // Assign ID from the array
            buttons[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

            // Initialize text views
            textViews[i] = new TextView(this);
            textViews[i].setText("TextView " + (i + 1));
            textViews[i].setId(textViewIds[i]); // Assign ID from the array
            textViews[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

            // Initialize edit texts
            editTexts[i] = new EditText(this);
            editTexts[i].setHint("EditText " + (i + 1));
            editTexts[i].setId(editTextIds[i]); // Assign ID from the array
            editTexts[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

            // Add widgets to the layout
            linearLayout.addView(buttons[i]);
            linearLayout.addView(textViews[i]);
            linearLayout.addView(editTexts[i]);
        }

        // Set the layout as the content view
        setContentView(linearLayout);
    }
}
