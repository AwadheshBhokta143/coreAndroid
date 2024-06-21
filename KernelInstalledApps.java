import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class KernelInstalledApps extends AppCompatActivity {

    private ListView appListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appListView = findViewById(R.id.appListView);

        // Get PackageManager instance
        PackageManager packageManager = getPackageManager();

        // Get list of installed applications
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        // List to store app names
        ArrayList<String> appNamesList = new ArrayList<>();

        // Iterate through installed applications
        for (ApplicationInfo appInfo : installedApplications) {
            String appName = appInfo.loadLabel(packageManager).toString();
            appNamesList.add(appName);
        }

        // Display app names in ListView using ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, appNamesList);
        appListView.setAdapter(adapter);
    }
}
