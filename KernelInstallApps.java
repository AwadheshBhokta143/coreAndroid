import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class KernelInstallApps extends AppCompatActivity {

    private static final int INSTALL_REQUEST_CODE = 123; // Request code for installing APK

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to install an APK
    public void installApk(View view) {
        // Specify the APK file path
        String apkFilePath = "/sdcard/Download/example.apk"; // Example path, replace with your APK file path

        File apkFile = new File(apkFilePath);
        if (!apkFile.exists()) {
            Toast.makeText(this, "APK file not found", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create a PackageInstaller session
        try {
            PackageInstaller packageInstaller = getPackageManager().getPackageInstaller();
            PackageInstaller.SessionParams params = new PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL);
            int sessionId = packageInstaller.createSession(params);
            PackageInstaller.Session session = packageInstaller.openSession(sessionId);

            // Open APK file for reading
            InputStream inputStream = new FileInputStream(apkFile);
            OutputStream outputStream = session.openWrite("COSU", 0, -1);

            byte[] buffer = new byte[65536];
            int c;
            while ((c = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, c);
            }

            session.fsync(outputStream);
            inputStream.close();
            outputStream.close();

            // Commit the session (this will start the installation process)
            session.commit(createIntentSender(sessionId));
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error installing APK", Toast.LENGTH_SHORT).show();
        }
    }

    // Create IntentSender for the installation process
    private PendingIntent createIntentSender(int sessionId) {
        Intent intent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
        intent.setData(Uri.parse("package:com.example.appname"));
        intent.putExtra(Intent.EXTRA_RETURN_RESULT, true);
        intent.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, getPackageName());

        PendingIntent pendingIntent = PendingIntent.getActivity(this, INSTALL_REQUEST_CODE, intent, 0);
        return pendingIntent;
    }
}
