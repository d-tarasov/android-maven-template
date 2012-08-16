package com.devoxy.android.template.test.instrumentation;

import android.test.ActivityInstrumentationTestCase2;
import com.devoxy.android.template.MainActivity;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.devoxy.android.template.test.instrumentation.MainActivityTest \
 * com.devoxy.android.template.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.devoxy.android.template", MainActivity.class);
    }

    public void testSimpleAssert() throws Exception {
        assertTrue(true);
    }
}
