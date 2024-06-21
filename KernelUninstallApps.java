import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kernelUninstallApps extends AppCompatActivity {

    private static final String PACKAGE_NAME_TO_UNINSTALL = "com.example.appname"; // Package name of the app to uninstall

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to uninstall an APK
    public void uninstallApk(View view) {
        // Create intent to uninstall package
        Intent intent = new Intent(Intent.ACTION_DELETE);
        intent.setData(Uri.parse("package:" + PACKAGE_NAME_TO_UNINSTALL));
        startActivity(intent);
    }
}
