import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class KernelInformation extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log information about the device
        logDeviceInformation();

        // Log names of installed APKs
        logInstalledApplications();

        // Log phone specifications
        logPhoneSpecifications();
    }

    // Method to log general device information
    private void logDeviceInformation() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        int sdkVersion = Build.VERSION.SDK_INT;
        String androidVersion = Build.VERSION.RELEASE;

        Log.i(TAG, "Manufacturer: " + manufacturer);
        Log.i(TAG, "Model: " + model);
        Log.i(TAG, "SDK Version: " + sdkVersion);
        Log.i(TAG, "Android Version: " + androidVersion);
    }

    // Method to log names of installed APKs
    private void logInstalledApplications() {
        PackageManager pm = getPackageManager();
        StringBuilder sb = new StringBuilder();

        // Get a list of installed packages
        for (PackageInfo packageInfo : pm.getInstalledPackages(PackageManager.GET_META_DATA)) {
            // Check if the package is not a system app
            if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                String appName = packageInfo.applicationInfo.loadLabel(pm).toString();
                sb.append(appName).append("\n");
            }
        }

        Log.i(TAG, "Installed APKs:\n" + sb.toString());
    }

    // Method to log phone specifications
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void logPhoneSpecifications() {
        TelephonyManager tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        if (tm != null) {
            String imei = tm.getImei();
            String phoneNumber = tm.getLine1Number();
            String networkOperator = tm.getNetworkOperatorName();
            String simOperator = tm.getSimOperatorName();

            Log.i(TAG, "IMEI: " + imei);
            Log.i(TAG, "Phone Number: " + phoneNumber);
            Log.i(TAG, "Network Operator: " + networkOperator);
            Log.i(TAG, "SIM Operator: " + simOperator);
        }
    }
}
