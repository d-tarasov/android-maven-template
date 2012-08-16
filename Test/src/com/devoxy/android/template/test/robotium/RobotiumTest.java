package com.devoxy.android.template.test.robotium;

import android.test.ActivityInstrumentationTestCase2;
import com.devoxy.android.template.MainActivity;
import com.jayway.android.robotium.solo.Solo;

/**
 * @author Dmitriy Tarasov
 */
public class RobotiumTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public RobotiumTest() {
        super("com.devoxy.android.template", MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testLibActivityCall() throws Exception {
        solo.clickOnButton(0);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
