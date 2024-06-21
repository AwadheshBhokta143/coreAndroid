
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class RuntimePermission2 extends AppCompatActivity {

    private static final int REQUEST_PERMISSIONS_CODE = 1;
    public static final String[] ALL_PERMISSIONS = {
            // Normal Permissions
            "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS",
            "android.permission.ACCESS_NETWORK_STATE",
            "android.permission.ACCESS_WIFI_STATE",
            "android.permission.BLUETOOTH",
            "android.permission.BLUETOOTH_ADMIN",
            "android.permission.BLUETOOTH_CONNECT",
            "android.permission.BLUETOOTH_SCAN",
            "android.permission.CHANGE_NETWORK_STATE",
            "android.permission.CHANGE_WIFI_MULTICAST_STATE",
            "android.permission.CHANGE_WIFI_STATE",
            "android.permission.DISABLE_KEYGUARD",
            "android.permission.EXPAND_STATUS_BAR",
            "android.permission.FOREGROUND_SERVICE",
            "android.permission.GET_PACKAGE_SIZE",
            "android.permission.INTERNET",
            "android.permission.KILL_BACKGROUND_PROCESSES",
            "android.permission.MANAGE_OWN_CALLS",
            "android.permission.NFC",
            "android.permission.NFC_TRANSACTION_EVENT",
            "android.permission.POST_NOTIFICATIONS",
            "android.permission.READ_SYNC_SETTINGS",
            "android.permission.RECEIVE_BOOT_COMPLETED",
            "android.permission.REORDER_TASKS",
            "android.permission.REQUEST_COMPANION_PROFILE_COMPUTER",
            "android.permission.REQUEST_COMPANION_PROFILE_WATCH",
            "android.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND",
            "android.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND",
            "android.permission.SCHEDULE_EXACT_ALARM",
            "android.permission.USE_FULL_SCREEN_INTENT",
            "android.permission.VIBRATE",
            "android.permission.WAKE_LOCK",
            "android.permission.WRITE_SYNC_SETTINGS",

            // Dangerous Permissions
            "android.permission.ACCEPT_HANDOVER",
            "android.permission.ACCESS_BACKGROUND_LOCATION",
            "android.permission.ACCESS_COARSE_LOCATION",
            "android.permission.ACCESS_FINE_LOCATION",
            "android.permission.ACTIVITY_RECOGNITION",
            "android.permission.ADD_VOICEMAIL",
            "android.permission.ANSWER_PHONE_CALLS",
            "android.permission.BODY_SENSORS",
            "android.permission.BODY_SENSORS_BACKGROUND",
            "android.permission.CALL_PHONE",
            "android.permission.CAMERA",
            "android.permission.READ_CALENDAR",
            "android.permission.WRITE_CALENDAR",
            "android.permission.READ_CALL_LOG",
            "android.permission.WRITE_CALL_LOG",
            "android.permission.READ_CONTACTS",
            "android.permission.WRITE_CONTACTS",
            "android.permission.GET_ACCOUNTS",
            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE",
            "android.permission.MANAGE_EXTERNAL_STORAGE",
            "android.permission.READ_PHONE_NUMBERS",
            "android.permission.READ_PHONE_STATE",
            "android.permission.READ_PRIVILEGED_PHONE_STATE",
            "android.permission.RECEIVE_MMS",
            "android.permission.RECEIVE_SMS",
            "android.permission.RECEIVE_WAP_PUSH",
            "android.permission.RECORD_AUDIO",
            "android.permission.SEND_SMS",
            "android.permission.USE_SIP",

            // Signature Permissions
            "android.permission.BIND_ACCESSIBILITY_SERVICE",
            "android.permission.BIND_AUTOFILL_SERVICE",
            "android.permission.BIND_CALL_REDIRECTION_SERVICE",
            "android.permission.BIND_CARRIER_MESSAGING_SERVICE",
            "android.permission.BIND_CARRIER_SERVICES",
            "android.permission.BIND_CHOOSER_TARGET_SERVICE",
            "android.permission.BIND_CONDITION_PROVIDER_SERVICE",
            "android.permission.BIND_CONTROLS",
            "android.permission.BIND_DEVICE_ADMIN",
            "android.permission.BIND_DREAM_SERVICE",
            "android.permission.BIND_INCALL_SERVICE",
            "android.permission.BIND_INPUT_METHOD",
            "android.permission.BIND_MIDI_DEVICE_SERVICE",
            "android.permission.BIND_NFC_SERVICE",
            "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE",
            "android.permission.BIND_PRINT_SERVICE",
            "android.permission.BIND_QUICK_ACCESS_WALLET_SERVICE",
            "android.permission.BIND_REMOTEVIEWS",
            "android.permission.BIND_SCREENING_SERVICE",
            "android.permission.BIND_TELECOM_CONNECTION_SERVICE",
            "android.permission.BIND_TEXT_SERVICE",
            "android.permission.BIND_TV_INPUT",
            "android.permission.BIND_VISUAL_VOICEMAIL_SERVICE",
            "android.permission.BIND_VOICE_INTERACTION",
            "android.permission.BIND_VPN_SERVICE",
            "android.permission.BIND_WALLPAPER",
            "android.permission.CLEAR_APP_CACHE",
            "android.permission.CONTROL_LOCATION_UPDATES",
            "android.permission.DELETE_CACHE_FILES",
            "android.permission.DELETE_PACKAGES",
            "android.permission.DIAGNOSTIC",
            "android.permission.INSTALL_PACKAGES",
            "android.permission.INSTALL_SHORTCUT",
            "android.permission.INSTANT_APP_FOREGROUND_SERVICE",
            "android.permission.INTERACT_ACROSS_USERS",
            "android.permission.INTERACT_ACROSS_USERS_FULL",
            "android.permission.LOADER_USAGE_STATS",
            "android.permission.MANAGE_DOCUMENTS",
            "android.permission.MANAGE_OWN_CALLS",
            "android.permission.PACKAGE_USAGE_STATS",
            "android.permission.PROCESS_OUTGOING_CALLS",
            "android.permission.READ_LOGS",
            "android.permission.READ_PRECISE_PHONE_STATE",
            "android.permission.READ_SEARCH_INDEXABLES",
            "android.permission.READ_SETTINGS",
            "android.permission.READ_SYNC_STATS",
            "android.permission.REBOOT",
            "android.permission.REQUEST_DELETE_PACKAGES",
            "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS",
            "android.permission.REQUEST_INSTALL_PACKAGES",
            "android.permission.SEND_RESPOND_VIA_MESSAGE",
            "android.permission.SET_ALARM",
            "android.permission.SET_ALWAYS_FINISH",
            "android.permission.SET_ANIMATION_SCALE",
            "android.permission.SET_DEBUG_APP",
            "android.permission.SET_PREFERRED_APPLICATIONS",
            "android.permission.SET_PROCESS_LIMIT",
            "android.permission.SET_TIME",
            "android.permission.SET_TIME_ZONE",
            "android.permission.SET_WALLPAPER",
            "android.permission.SET_WALLPAPER_HINTS",
            "android.permission.SHUTDOWN",
            "android.permission.SIGNAL_PERSISTENT_PROCESSES",
            "android.permission.STATUS_BAR",
            "android.permission.SYSTEM_ALERT_WINDOW",
            "android.permission.TRANSMIT_IR",
            "android.permission.UNINSTALL_SHORTCUT",
            "android.permission.UPDATE_DEVICE_STATS",
            "android.permission.USE_FINGERPRINT",
            "android.permission.WRITE_APN_SETTINGS",
            "android.permission.WRITE_GSERVICES",
            "android.permission.WRITE_SECURE_SETTINGS",
            "android.permission.WRITE_SETTINGS",
            "android.permission.WRITE_SYNC_SETTINGS",

            // Special Permissions
            "android.permission.SYSTEM_ALERT_WINDOW",
            "android.permission.WRITE_SETTINGS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkAndRequestPermissions();
    }

    private void checkAndRequestPermissions() {
        // List of permissions not yet granted
        List<String> permissionsNeeded = new ArrayList<>();

        for (String permission : ALL_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsNeeded.add(permission);
            }
        }

        if (!permissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this,
                    permissionsNeeded.toArray(new String[0]),
                    REQUEST_PERMISSIONS_CODE);
        } else {
            // All permissions are granted, proceed with your functionality
            Toast.makeText(this, "All permissions are already granted!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSIONS_CODE) {
            boolean allPermissionsGranted = true;

            for (int result : grantResults) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    allPermissionsGranted = false;
                    break;
                }
            }

            if (allPermissionsGranted) {
                // All permissions are granted, proceed with your functionality
                Toast.makeText(this, "All permissions granted!", Toast.LENGTH_SHORT).show();
            } else {
                // Some permissions are denied, handle accordingly
                Toast.makeText(this, "Some permissions are denied.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
