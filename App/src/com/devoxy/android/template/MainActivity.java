package com.devoxy.android.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.devoxy.android.template.lib.LibraryActivity;
import com.devoxy.android.template.lib.LibraryMain;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LibraryMain main = new LibraryMain();
        Toast.makeText(this, main.getMessage(), Toast.LENGTH_LONG).show();
    }

    public void openLibActivity(View view) {
        Intent intent = new Intent(this, LibraryActivity.class);
        startActivity(intent);
    }
}
