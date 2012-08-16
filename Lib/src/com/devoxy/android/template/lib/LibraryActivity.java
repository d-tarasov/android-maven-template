package com.devoxy.android.template.lib;

import android.app.Activity;
import android.os.Bundle;
import com.devoxy.android.template.R;

/**
 * @author Dmitriy Tarasov
 */
public class LibraryActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}