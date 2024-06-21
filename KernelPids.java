import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class kernelPids extends AppCompatActivity {

    private TextView pidListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pidListTextView = findViewById(R.id.pidListTextView);

        // Get ActivityManager
        ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);

        // Get running app processes
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();

        // Build PID list
        StringBuilder pidList = new StringBuilder();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo processInfo : runningAppProcesses) {
                pidList.append(processInfo.pid).append("\n");
            }
        }

        // Display PID list
        pidListTextView.setText(pidList.toString());
    }
}
